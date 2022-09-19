public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight,int price,int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;


    }
    public void checkPrice() {
        if(this.price<600) {
            System.out.println("This notebook is very cheap.");
        }else if (this.price>600 && this.price<1000) {
            System.out.println("The price is good.");
        }else{
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight<1000) {
            System.out.println("This notebook is light.");
        }else if (this.weight>1000 && this.weight<1800) {
            System.out.println("This notebook is not too heavy.");
        }else{
            System.out.println("This notebook is heavy.");
        }
    }
    public void checkYear() {
        if (this.year>2020 && this.price<1800 || this.year<2020 && this.year>2018 && this.price<1300 ) {
            System.out.println("This notebook is a good choice.");
        }else if (this.year>2016 && this.price<1250) {
            System.out.println("This notebook is fine choice.");
        }else{
            System.out.println("This notebook is not a good choice.");
        }

    }
}
