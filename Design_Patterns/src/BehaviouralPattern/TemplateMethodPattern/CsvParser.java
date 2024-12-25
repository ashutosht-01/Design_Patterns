package BehaviouralPattern.TemplateMethodPattern;

public class CsvParser extends DataParser{
    @Override
    protected void parse() {
        System.out.println("Parsing csv data..");
    }
}
