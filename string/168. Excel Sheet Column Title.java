class Solution {
    public String convertToTitle(int columnNumber) {
        String s = "";
        if (columnNumber <= 0) {
            return "";
        }

        columnNumber--;
        s = convertToTitle(columnNumber / 26)
                + (char) ('A' + columnNumber % 26);

        return s;
    }
}