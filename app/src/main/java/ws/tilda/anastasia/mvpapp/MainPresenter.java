package ws.tilda.anastasia.mvpapp;

public class MainPresenter implements MainContractor.MainPresenter {

    MainContractor.MainView mView;

    public MainPresenter(MainContractor.MainView view) {
        mView = view;
    }

    @Override
    public void onButtonClick(String userName) {
        UserModel userModel = new UserModel();
        userModel.name = userName;
    }
}
