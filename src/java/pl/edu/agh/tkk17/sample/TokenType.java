package pl.edu.agh.tkk17.sample;

public enum TokenType
{
    END("END"),
    NUM("NUM"),
    ADD("ADD"),
    MUL("MUL"),
    SUB("SUB"),
    DIV("DIV"),
    LPT("LPT"), //left parenthesis
    RPT("RPT"); //right parenthesis

    private final String name;

    TokenType(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}
