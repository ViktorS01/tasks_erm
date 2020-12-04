package ru.sychev.publication;

import java.util.Arrays;

public class Publication {
    private final String title;
    String text;
    Comment[] comment;
    private final String[] tags;
    int rating;
    private boolean isEditable;

    public Publication(String title, String[] tags, String text, Comment[] comment,  int rating){
        this.comment = comment;
        this.rating = rating;
        this.tags = tags;
        this.text = text;
        this.title = title;
        this.isEditable = this.comment == null;
    }

    public String getTitle() {
        return title;
    }

    public boolean isEditable()
    {
        return isEditable;
    }

    public void incrementRating()
    {
        this.rating++;
        this.isEditable = false;
    }

    public void decrementRating()
    {
        this.rating--;
        this.isEditable = false;
    }

    public void setText(String t)
    {
        if (!isEditable())
            throw new IllegalArgumentException("the publication is not editable.");

        this.text = t;
    }

    public String toString(){
        String result = "(" + rating + ") " + title + "\n" + "Теги: ";

        for (String x: tags){
            result += x + ", ";
        }

        result += "\n" + text + "\n" + "Коментарии: " + "\n";
        result += Comment.commentsTreeToString(comment);
        return result;
    }
}
