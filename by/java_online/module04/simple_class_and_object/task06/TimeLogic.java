package by.java_online.module04.simple_class_and_object.task06;

public class TimeLogic {
    public void addTime(Time time, int hoursToAdd,
                        int minutesToAdd, int secondsToAdd) {

        int newHours;
        int newMinutes;
        int newSeconds;
        int sum;

        sum = time.getSeconds() + secondsToAdd;
        newSeconds = sum % 60;
        newMinutes = time.getMinutes() + (sum / 60);

        sum = newMinutes + minutesToAdd;
        newMinutes = sum % 60;
        newHours = time.getHours() + (sum / 60);

        sum = newHours + hoursToAdd;

        if (sum > 23) {
            newHours = sum - ((sum / 24) * 24);
        } else {
            newHours = sum;
        }

        time.setHours(newHours);
        time.setMinutes(newMinutes);
        time.setSeconds(newSeconds);
    }

    public void subtractTime(Time time, int hoursToSubtract,
                             int minutesToSubtract, int secondsToSubtract) {

        int newHours;
        int newMinutes;
        int newSeconds;

        if (time.getSeconds() >= secondsToSubtract % 60) {
            newSeconds = time.getSeconds() - (secondsToSubtract % 60);
        } else {
            newSeconds = (time.getSeconds() + 60) - (secondsToSubtract % 60);
            minutesToSubtract = minutesToSubtract - (secondsToSubtract / 60);
        }

        if (time.getMinutes() >= minutesToSubtract % 60) {
            newMinutes = time.getMinutes() - (minutesToSubtract % 60);
        } else {
            newMinutes = (time.getMinutes() + 60) - (minutesToSubtract % 60);
            hoursToSubtract = hoursToSubtract - (minutesToSubtract / 60);
        }

        if (time.getHours() >= hoursToSubtract) {
            newHours = time.getHours() - hoursToSubtract;
        } else {
            newHours = (time.getHours() + 24) - (hoursToSubtract % 24);
        }

        time.setHours(newHours);
        time.setMinutes(newMinutes);
        time.setSeconds(newSeconds);
    }
}