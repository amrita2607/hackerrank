public class GList
{
    Guest[] g;
    int size;
    int i=0;

    GList(int size)
    {
        this.size=size;
        g=new Guest[this.size];
    }

    void add(Guest x)
    {
        if(!isFull())
        {
            g[i]=x;
            i++;
        }
        else
        {
            for(int j=0;j<i;j++)
            {
                if(x.gno==g[i].gno)
                {
                    g[i]=x;
                    break;
                }
            }
        }
    }
    void remove()
    {
        g[i].name="Null";
        g[i].gno=0;
        i--;

    }
    void display()
    {
        for(int j=0;j<g.length;j++)
        {
            System.out.println(g[j].gno+" "+g[j].name);
        }
    }
    boolean isFull()
    {
        if(i==size)
            return true;
        else
            return false;
    }

    void sort()
    {
        Guest a=new Guest();
        for(int j=0;j<g.length;j++)
        {
            for(int k=0;k<i-j;k++)
            {
                if(g[k].gno>g[k+1].gno)
                {
                    a=g[k];
                    g[k]=g[k+1];
                    g[k+1]=a;
                }
            }
        }
    }
}
