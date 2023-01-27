package Week1;

public class Main9 {
    interface olaCustomer{
        void bookCab();
        void findARide();
        void rentCab();
        void rateDriver();
        void scheduleCab();
        void cancelCab();
        void addMoneytoWallet();
        void raiseTicket();
        void signup();
        void signIn();
        }

        interface olaDriver{
        void acceptBooking();
        void getCustomerLocation();
        void setAvailableStatus();
        void getMyCommission();
        void raiseMoneyTransferRequest();
        void callCustomer();
        void setUpYourVehicle();
        void customerFeedback();
        }

        interface olaOwner{
            void getDriverRecords();
            void getReportByDriverID();
            void getReportByRegion();
            void getTotalRevenue();
            void getCustomersFeedback();
            void addDriver();
            void removeDriver();
            void changeDriverStatus();
            }


            public class main9 implements olaOwner,olaDriver,olaCustomer {
                public void main(String[] args) {
                    olaCustomer cust = new main9();
                    olaDriver manoj = new main9();
                    }

                @Override
                public void bookCab() {

                }

                @Override
                public void findARide() {

                }

                @Override
                public void rentCab() {

                }

                @Override
                public void rateDriver() {

                }

                @Override
                public void scheduleCab() {

                }

                @Override
                public void cancelCab() {

                }

                @Override
                public void addMoneytoWallet() {

                }

                @Override
                public void raiseTicket() {

                }

                @Override
                public void signup() {

                }

                @Override
                public void signIn() {

                }

                @Override
                public void acceptBooking() {

                }

                @Override
                public void getCustomerLocation() {

                }

                @Override
                public void setAvailableStatus() {

                }

                @Override
                public void getMyCommission() {

                }

                @Override
                public void raiseMoneyTransferRequest() {

                }

                @Override
                public void callCustomer() {

                }

                @Override
                public void setUpYourVehicle() {

                }

                @Override
                public void customerFeedback() {

                }

                @Override
                public void getDriverRecords() {

                }

                @Override
                public void getReportByDriverID() {

                }

                @Override
                public void getReportByRegion() {

                }

                @Override
                public void getTotalRevenue() {

                }

                @Override
                public void getCustomersFeedback() {

                }

                @Override
                public void addDriver() {

                }

                @Override
                public void removeDriver() {

                }

                @Override
                public void changeDriverStatus() {

                }
            }
}
