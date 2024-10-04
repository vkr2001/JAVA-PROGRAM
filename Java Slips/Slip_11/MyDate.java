class MyDate {
    private int dd;
    private int mm;
    private int yy;

    // Parameterized constructor
    public MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    // Display the date in dd-mm-yy format
    public void displayDate() {
        System.out.println(this.dd + "/" + this.mm + "/" + this.yy);
    }

    public static void main(String[] args) {
        MyDate date = new MyDate(4, 11, 2023);
        System.out.print("Date: ");
        date.displayDate();
    }
}

