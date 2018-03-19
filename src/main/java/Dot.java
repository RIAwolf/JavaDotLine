public class Dot extends Object {
    private float _x;
    private float _y;
    private String _color;

    public Dot() {
    }

    public Dot(float x, float y) {
        _x = x;
        _y = y;
    }

    public Dot(float x, float y, String color) {
        _x = x;
        _y = y;
        _color = color;
    }

    public Dot(String color) {
        _color = color;
    }

    public float getX() {
        return _x;
    }

    public float getY() {
        return _y;
    }

    public String getColor() {
        return _color;
    }

    @Override
    public boolean equals(Object obj) {
        Dot b = (Dot) obj;
        if (_x == b.getX() && _y == b.getY() && _color.equals(b.getColor())) {
            return true;
        }
        return false;
    }

    public double dist(Dot b) {
        return Math.sqrt(Math.pow(b.getX() - _x, 2) + Math.pow(b.getY() - _y, 2));
    }

    public double dist(float x, float y) {
        return Math.sqrt(Math.pow(x - _x, 2) + Math.pow(y - _y, 2));
    }

    public int quart() {
        if (_x >= 0) {
            if (_y >= 0) {
                return 0;
            } else {
                return 3;
            }
        } else {
            if (_y >= 0) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    public boolean isSameQuart(Dot b) {
        return b.quart() == quart();
    }
}
