package by.java_online.module04.aggregation_and_composition.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private Sentence heading;
    private List<Sentence> body;

    public Text() {
        heading = new Sentence();
        body = new ArrayList<>();
    }

    public Text(Sentence heading) {
        this.heading = heading;
        this.body = new ArrayList<>();
    }

    public Sentence getHeading() {
        return heading;
    }

    public List<Sentence> getBody() {
        return body;
    }

    public void setHeading(Sentence heading) {
        this.heading = heading;
    }

    public void setBody(List<Sentence> body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "heading: " + heading +
                ", body: " + body +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((body == null) ? 0 : body.hashCode());
        result = prime * result + ((heading == null) ? 0 : heading.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Text other = (Text) obj;
        if (body == null) {
            if (other.body != null)
                return false;
        } else if (!body.equals(other.body))
            return false;
        if (heading == null) {
            if (other.heading != null)
                return false;
        } else if (!heading.equals(other.heading))
            return false;
        return true;
    }
}