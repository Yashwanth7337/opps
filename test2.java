class Account {
    int acc_id;
    String acc_name;
    String place;
    Account(int id,String name,String place)
    {
        this.acc_id=id;
        this.acc_name=name;
        this.place=place;
    }
    
}
class saving extends Account{
    saving(int id,String name,String place,int amount,int sav_min)
    {
        super(id,name,place);
        sav_min=500;
    }
   public void display()

    {
        System.out.println("savings account");
    }

    }




class current extends saving{
    current(int id,String name,String place,int amount,int cur_min)
    {
super(id,name,place);
cur_min=5000;

    }
    public void dis()
    {
System.out.println("current account");
    }

} 
class test2
{
    public static void main(String args[])
    {
Account c=new Account(101,"yash","bangalore",50000);

c.display();
c.dis();



    }
}