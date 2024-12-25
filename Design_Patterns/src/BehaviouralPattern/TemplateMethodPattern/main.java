package BehaviouralPattern.TemplateMethodPattern;

public class main {
    public static void main(String[] args) {
        DataParser csvParser = new CsvParser();
        csvParser.parseData();
        DataParser jsonParser = new JsonParser();
        jsonParser.parseData();
    }
}
