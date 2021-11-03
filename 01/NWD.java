public class NWD {
    public int NWD_1(int first, int second)
    {
        while (first != second)
        {
            if (first > second)  // check
            {
                first = first - second;
            }
            else
            {
                second = second - first;
            }
        }
        return first;
    }
}
