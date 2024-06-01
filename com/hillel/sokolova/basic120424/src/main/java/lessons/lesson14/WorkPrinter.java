package lessons.lesson14;

public class WorkPrinter implements Printer {

    @Override
    public void print(Message message) {
        boolean isMessageEmpty = message == null;
        boolean isSenderEmpty = isMessageEmpty || message.getSender() == null || message.getSender().isEmpty();
        boolean isTextEmpty = isMessageEmpty || message.getText() == null || message.getText().isEmpty();
        if (isSenderEmpty && isTextEmpty) {
            Printer printer = new Printer() {
                @Override
                public void print(Message message) {
                    System.out.println("An empty message from an anonymous user is being processed...");
                }
            };
            printer.print(new Message("", ""));
        } else if (isSenderEmpty) {
            System.out.println("An anonymous user sent a message: " + message.getText());
        } else if (!isSenderEmpty) {
            System.out.printf("User %s sent a message: %s.", message.getSender(), message.getText());
        }
    }

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

    }
}
