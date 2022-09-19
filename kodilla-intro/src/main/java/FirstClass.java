public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600,1000, 2021);
        System.out.println(notebook.weight + " " + notebook.price+" "+ notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2015);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price+ " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 900,2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price+ " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

        Notebook notebookLenovo = new Notebook(600,1200, 2019);
        System.out.println(notebookLenovo.weight + " " + notebookLenovo.price+" "+ notebookLenovo.year);
        notebookLenovo.checkPrice();
        notebookLenovo.checkWeight();
        notebookLenovo.checkYear();

        Notebook notebookHP = new Notebook(600,800, 2017);
        System.out.println(notebookHP.weight + " " + notebookHP.price+" "+ notebookHP.year);
        notebookHP.checkPrice();
        notebookHP.checkWeight();
        notebookHP.checkYear();

        Notebook notebookAsus = new Notebook(600,1600, 2018);
        System.out.println(notebookAsus.weight + " " + notebookAsus.price+" "+ notebookAsus.year);
        notebookAsus.checkPrice();
        notebookAsus.checkWeight();
        notebookAsus.checkYear();

        Notebook notebookApple = new Notebook(600,900, 2012);
        System.out.println(notebookApple.weight + " " + notebookApple.price+" "+ notebookApple.year);
        notebookApple.checkPrice();
        notebookApple.checkWeight();
        notebookApple.checkYear();

    }
}