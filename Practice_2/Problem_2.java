public class StarTriangle
{
    private int width;

    public StarTriangle(int width)
    {
        this.width = width;
    }

    public String toString()
    {
        String ret_urn = "";

        for (int i = 1; i <= width; ++i) {
            for (int j = 1; j <= i; ++j) {
                ret_urn += "[*]";
            }
            ret_urn += "\n";
        }

        return ret_urn;
    }
}