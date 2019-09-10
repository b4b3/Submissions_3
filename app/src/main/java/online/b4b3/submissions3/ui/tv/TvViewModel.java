package online.b4b3.submissions3.ui.tv;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class TvViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public TvViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Tv fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
