public class Line {
    private Dot _start;
    private Dot _end;

    public Line(Dot start, Dot end){
        _start = start;
        _end = end;
    }

    public Dot getStart() {
        return _start;
    }

    public Dot getEnd() {
        return _end;
    }
    public double getLineLength(){
        return _start.dist(_end);
    }
    public int getStartQuart(){
        return _start.quart();
    }
    public int getEndQuart(){
        return _end.quart();
    }

}
