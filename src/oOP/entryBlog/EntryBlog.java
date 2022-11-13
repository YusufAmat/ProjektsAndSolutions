package oOP.entryBlog;

public class EntryBlog {
    private String username;
    private String textOfEntry;
    private String dateOfEntry;


    public EntryBlog(String username, String textOfEntry, String dateOfEntry) {
        this.username = username;
        this.textOfEntry = textOfEntry;
        this.dateOfEntry = dateOfEntry;
    }

    public EntryBlog() {
    }

    public void displayEntry() {
        System.out.println( "Blog Entry[" +
                "username=\"" + username + '\"' +
                ", date of Entry=\"" + dateOfEntry + '\"' +
                ']');
    }

    public String getSummary(){
        String result = "";
        if (textOfEntry.length()<=10) {
            result = textOfEntry;
        }else{
            for (int i = 0; i < 10; i++) {
                result += textOfEntry.charAt(i);
            }
        }
        return result;
    }
}
