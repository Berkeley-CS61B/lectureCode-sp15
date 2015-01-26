Provides a toString method:

    public String toString() {
        if (tail == null)
            return Integer.toString(head);
        return Integer.toString(head) + " " + tail.toString();
    }