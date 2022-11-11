// типы данных
public class DataTypes {
    public static void main(String[] args) {
        int book_number = 0x2473F;      // 149311
        System.out.println("Номер зачетной книжки: " + book_number);
        long phoneNumber = 89994030620L;
        System.out.println("Номер телефона: " + phoneNumber);
        byte twoNumbers = 0b10100;
        System.out.println("Две последние цифры номера:" +  twoNumbers);       // 20
        short fourNumbers = 05766;
        System.out.println("Последние четыре цифры номера: " + fourNumbers);  // я передвинула, иначе 0620
        int studentNumber = 10;
        int remainder = ((--studentNumber)%26);
        ++remainder;
        System.out.println("Остаток от деления: " + remainder);
       // char p=remainder;
        System.out.println("Cимвол английского алфавита: " + (char) (remainder + 'A' - 1));
    }
}