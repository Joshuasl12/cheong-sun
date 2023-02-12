public class Robot extends Order implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            for(int i = 0; i < qty; i++){
                if(i+1 < qty) System.out.println((i+1)+"/"+ qty +" " + menuName + " still preparing");
                else System.out.println((i+1)+"/"+ qty +" " + menuName + " ready to served!");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Robot is interrupted...");
        }
    }

    @Override
    void setMenu(String menuName) {
        // TODO Auto-generated method stub
        this.menuName = menuName;
    }

    @Override
    void setQty(int qty) {
        // TODO Auto-generated method stub
        this.qty = qty;
    }
}