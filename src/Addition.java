public class Addition {
    int num1, num2;
    
    public Addition(int num1, int num2) {
        super();
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public boolean isDivisibleByTen() {
        int sum = super.num1 + super.num2;
        return (sum % 10 == 0);
    }
    
    public static void main(String[] args) {
        Addition add = new Addition(20, 30);
        boolean result = add.isDivisibleByTen();
       
        if(result) {
            System.out.println("The sum is divisible by 10");
        } 
        else {
            System.out.println("The sum is not divisible by 10");
        }
    }
}

