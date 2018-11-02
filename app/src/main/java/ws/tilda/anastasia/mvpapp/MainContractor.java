package ws.tilda.anastasia.mvpapp;

public interface MainContractor {

    interface MainView {

    }

    interface MainPresenter {

        void onButtonClick(String name);
    }
}
