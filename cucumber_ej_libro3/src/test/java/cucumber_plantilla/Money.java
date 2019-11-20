package cucumber_plantilla;

public class Money(String amount) {
        Pattern pattern = Pattern.compile("^[^\\d]*([\\d]+)\\.([\\d][\\d])$");
        Matcher matcher = pattern.matcher(amount);
        matcher.find();
        this.dollars = Integer.parseInt(matcher.group(1));
        this.cents = Integer.parseInt(matcher.group(2));


        }
