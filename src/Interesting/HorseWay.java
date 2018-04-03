/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interesting;
import java.util.ArrayList;

interface Chain<T>{
    T Previous();
    T Next();
}

class Point implements Comparable<Point>{
    protected int x;
    protected int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){ return "("+x+";"+y+")"; }

    @Override
    public int compareTo(Point t) {
        return (this.x == t.x) && (this.y == t.y)?0:-1;
    }
}
enum HorseDirection{
    UpLeft{
        @Override
        public Point nextPoint(Point currentPoint) {
            return new Point(currentPoint.x-2,currentPoint.y-1);
        }
    },
    UpRight{
        @Override
        public Point nextPoint(Point currentPoint) {
            return new Point(currentPoint.x-2,currentPoint.y+1);
        }
    },
    LeftUp{
        @Override
        public Point nextPoint(Point currentPoint) {
            return new Point(currentPoint.x-1,currentPoint.y-2);
        }
    },
    LeftDown{
        @Override
        public Point nextPoint(Point currentPoint) {
            return new Point(currentPoint.x+1,currentPoint.y-2);
        }
    },
    DownRight{
        @Override
        public Point nextPoint(Point currentPoint) {
            return new Point(currentPoint.x+2,currentPoint.y+1);
        }
    },
    DownLeft{
        @Override
        public Point nextPoint(Point currentPoint) {
            return new Point(currentPoint.x+2,currentPoint.y-1);
        }
    },
    RightUp{
        @Override
        public Point nextPoint(Point currentPoint) {
            return new Point(currentPoint.x-1,currentPoint.y+2);
        }
    },
    RightDown{
        @Override
        public Point nextPoint(Point currentPoint) {
            return new Point(currentPoint.x+1,currentPoint.y+2);
        }
    };
    public abstract Point nextPoint(Point currentPoint);
}

class Cell extends Point{
    private Cell prev;
    private int step;
    public ArrayList<Cell> next;
    {
        prev = null;
        step = 0;
        next = new <Cell> ArrayList();
    }
    public Cell(int x, int y){
        super(x,y);
    }
    public Cell(Point p){ this(p.x,p.y); }
    public Cell Previous(){ return this.prev; }
    public Cell Next(int idx){ return this.next.get(idx); }
    public boolean isStartCell(){ return (prev == null); }
    public boolean isEndCell(){ return next.isEmpty(); }
    public boolean containPoint(Point p){
        return ((isStartCell())?false:prev.containPoint(p)) ||
                (compareTo(p)==0);
    }
    public Cell AddNextCell(Cell c){
        c.prev = this;
        c.setStep(this.step+1);
        next.add(c);
        return c;
    }
    public int getStep(){ return this.step; }
    public void setStep(int stp){ this.step = stp; }
    
    @Override    
    public String toString(){
        String res = ""; 
        if (!isStartCell())
                res += prev.toString() + ",";
        return res + super.toString();
    }
}

class Field{
    public int startX, endX, startY, endY;
    public  int  countCells;
    public Field(int sx, int lenx, int sy, int leny){
        this.startX = sx;
        this.endX = sx+lenx-1;
        this.startY = sy;
        this.endY = sy+leny-1;
        countCells = lenx*leny;
    }
    public Field(int lenx, int leny){
        this(0,lenx,0,leny);
    }
    public boolean PointInField(Point p){
        return (p.x >= startX) && (p.x <= endX) && (p.y >= startY) && (p.y <= endY);
    }
}
class Engine{
    private Field field;
    private Cell startCell;
    private ArrayList<Cell> endedWays;
    {
        endedWays = new <Cell>ArrayList();
    }
    public Engine(Cell startCell, Field f){
        this.startCell = startCell;
        this.field = f;
    }
    public boolean AddNextCellTo(Cell currentNode, Field f){
        // 
        for(HorseDirection dir : HorseDirection.values()){
            Point nextPoint = dir.nextPoint(currentNode);
            if ((f.PointInField(nextPoint)) &&  !(currentNode.containPoint(nextPoint))){
                Cell addedCell = currentNode.AddNextCell(new Cell(nextPoint));
                WriteFullStep(addedCell);
            }
        }
        return !currentNode.isEndCell();
    }
    
    private boolean WriteFullStep(Cell s){
        if (s.getStep() == (field.countCells-1)){
            endedWays.add(s);
            return true;
        }
        return false;
    }
    
    public void Run(){
        ArrayList<Cell> processCells = new <Cell>ArrayList();
        processCells.add(startCell);
        
        long l = 0;
        while(!processCells.isEmpty()){
            Cell currentCell = processCells.remove(0);
            AddNextCellTo(currentCell, field);
            if (!currentCell.next.isEmpty())
                processCells.addAll(0,currentCell.next);
            processCells.trimToSize();
            if (endedWays.size() > 0)
                break;
            l++;
            //очищаем память
            if (Long.remainderUnsigned(l,1000)==0){
                Runtime r = Runtime.getRuntime();
                r.gc();
                r.freeMemory();
                l = 0;
            }
                
        }
    }
    public void printWays(){
        if (endedWays.isEmpty()){
            System.out.println("Конь не пройдет через этот дремучий лес.");
            return;
        }
        System.out.println();
        for (int i = 0; i < endedWays.size(); i++){
            Cell currentCell = endedWays.get(i);
            System.out.print("Путь №"+i+": ");
            System.out.println(currentCell.toString());
        }
    }
}
/**
 *
 * @author yesm
 */
public class HorseWay {
    public static void main(String[] args){
        Engine eng = new Engine(new Cell(0,0), new Field(7,9));
        eng.Run();
        eng.printWays();
    }
}
