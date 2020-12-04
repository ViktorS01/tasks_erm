package ru.sychev.publication;

public class Comment {
    int rating;
    String text;
    Comment[] second_comment;

    public Comment(int rating, String text, Comment[] second_comment) {
        this.rating = rating;
        this.text = text;
        this.second_comment = second_comment;
    }

    public String toString() {
        return "(" + rating + ") " + text;
    }

    public void incrementRating() {
        this.rating++;
    }

    public void decrementRating() {
        this.rating--;
    }

    public static String commentsTreeToString(Comment[] firstLevelComments) {
        String result = new String();

        result = commentsTreeToStringInner(result, firstLevelComments, "");

        return result;
    }

    private static String commentsTreeToStringInner(String outputBuffer, Comment [] firstLevelComments, String indentation) {
        for (Comment c : firstLevelComments) {
            outputBuffer += indentation + c + "\n";

            if (c.second_comment != null)
                outputBuffer = commentsTreeToStringInner(outputBuffer, c.second_comment, indentation + "    ");
        }

        return outputBuffer;
    }
}