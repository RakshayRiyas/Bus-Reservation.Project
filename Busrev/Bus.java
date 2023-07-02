package Busrev;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;//get and set

Bus(int no,boolean ac,int cap){
    this.busNo = no;
    this.ac    = ac;
    this.capacity= cap;
}
public int getcapacity(){//access method
    return capacity;
}
public int getbusNo(){//access method
    return busNo;
}
public boolean isAc(){//access method
    return ac;
}
public void SetAc(boolean val){
    ac=val;
}
public void SetCapacity(int cap){
    capacity= cap;
}
public void displayBusinfo(){
    System.out.println("Bus no:"+busNo+"Ac:"+ac+"Total Capacity:"+capacity);
}
}

