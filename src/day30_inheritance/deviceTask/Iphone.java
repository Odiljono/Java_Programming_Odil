package day30_inheritance.deviceTask;

    public class Iphone extends Phone{

        private boolean hasICloud;
        private int channel;

        public Iphone(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton, boolean hasICloud, int channel) {
            super(brand, model, color, size, price, hasBattery, hasPowerButton);
            this.hasICloud = hasICloud;
            this.channel = channel;
        }

        public boolean isHasICloud() {
            return hasICloud;
        }

        public void setHasICloud(boolean hasICloud) {
            this.hasICloud = hasICloud;
        }

        public int getChannel() {
            return channel;
        }

        public void setChannel(int channel) {
            this.channel = channel;
        }

        public void faceTime(long phoneNumber){
        System.out.println(getClass().getSimpleName() + " " + getBrand() + " " + " is facetiming " + phoneNumber);
    }
}
