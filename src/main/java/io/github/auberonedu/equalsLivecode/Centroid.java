package io.github.auberonedu.equalsLivecode;

public class Centroid {
    private int r;
    private int c;
    private String name;
    
    public Centroid(int r, int c, String name) {
        this.r = r;
        this.c = c;
        this.name = name;
    }

    public int getR() {
        return r;
    }

    public int getC() {
        return c;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + r;
        result = prime * result + c;
        result = prime * result + ((name == null) ? 0 : name.hashCode()); // Strings have their own hashcode
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Centroid other = (Centroid) obj;
        if (r != other.r)
            return false;
        if (c != other.c)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    

    // @Override
    // public boolean equals(Object o) {
    //     // if null, return false
    //     if (o == null) return false;
    //     // if a different class, return false
    //     if(getClass() != o.getClass()) return false;

    //     // At this point, we can assume these are both non null and the same class
    //     Centroid other = (Centroid) o; // casting (Type)

    //     // Check each part (this can be more concise, but we're making it more readable)
    //     // these primitive ints cannot be null
    //     if (r != other.r) return false;
    //     if (c != other.c) return false;
    //     // name might be null, so needs handled differently
    //     if (name == null) {
    //         if (other.name == null) return true;
    //         if (other.name != null) return false;
    //     }
    //     if (!name.equals(other.name)) return false;

    //     return true;
    // }
}
