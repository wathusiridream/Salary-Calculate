public class Employee extends Person{

    private double hourlyPay;
    
    public Employee(String name, int age, double hourlyPay) {
        super(name, age);
        this.hourlyPay = hourlyPay;
    }

    //getId(), setId(), getHourlyPay(), setHourlyPay())
    
    public void setHourlyPay(double hourlyPay){
        this.hourlyPay = hourlyPay;
    }
    public double getHourlyPay(){
        return hourlyPay;
    }
    //ในคลาส Employee ให้มีเมธอดชื่อ raiseHourlyPay() ทีมีหน้าที่ในการเพิ่ม hourlyPay ขึ้น 15% โดยขอให้มีการส่งค่ากลับเป็น hourlyPay ใหม่
    public double raiseHourlyPay(double hourlyPay){
        return hourlyPay = hourlyPay + (hourlyPay*0.15);
    }
    /*ในคลาส Employee ให้มีเมธอดชื่อ payDay(int hours) ที่มีหน้าที่ในการคำนวณหาค่าแรงที่ได้จากการทำงาน โดยขอให้มีวิะีการคิดค่าแรงดังนี้
    หากทำงานน้อยกว่าหรือเท่ากับ 40 ชม. (hours <= 40) ให้มีค่าแรงตามจำนวนชม. (hourlyPay * hours)
    หากทำงานมากกว่า 40 ชม. .ให้มีการคำนวณส่วนเกิน 40 ชม.เป็น OT โดยให้มีค่าแรงในส่วนที่เกิน 40 มาชม.ละ 1.5 เท่าของ hourlyPay เช่น hours = 42, hourlyPay = 100 จะได้ค่าแรงเท่ากับ 4300 THB.*/
    public String payDay(int hours){
        if(hours <= 40){
            double salary = hourlyPay*hours;
            return "Salary: " + salary+ " THB";
        }
        else{
            int ot = hours - 40;
            int newHours = hours - ot;
            double salary = (hourlyPay * newHours) + (ot * (1.5 * hourlyPay));
            return "Salary: "+ salary + " THB";
        }
    }
    public String toString() { 
        return "Pay per Hour: " + hourlyPay + " THB";
    }
   
    public boolean equals(Employee m) {
        if (m.hourlyPay == hourlyPay){
            return true;
        } else {
            return false;
        }
    }
}
