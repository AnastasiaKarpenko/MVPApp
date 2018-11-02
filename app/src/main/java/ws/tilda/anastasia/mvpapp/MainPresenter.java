package ws.tilda.anastasia.mvpapp;

public class MainPresenter implements MainContractor.MainPresenter {

    MainContractor.MainView mView;

    public MainPresenter(MainContractor.MainView view) {
        mView = view;
    }
}
