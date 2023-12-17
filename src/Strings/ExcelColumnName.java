package Strings;

public class ExcelColumnName {

    public static void main(String[] args) {
        ExcelColumnName s = new ExcelColumnName();
        String ss = s.convertToTitle(27);
        System.out.println(ss);

    }

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            sb.append( (char) (columnNumber % 26 + 'A'));
            //sb.insert(0, (char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return sb.toString();
    }
}