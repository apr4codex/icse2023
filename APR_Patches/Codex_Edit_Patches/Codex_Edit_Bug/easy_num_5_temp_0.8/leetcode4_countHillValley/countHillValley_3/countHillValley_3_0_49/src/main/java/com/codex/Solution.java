package com.codex;

import java.util.*;

public class Solution {
//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package com.miicaa.home.ui.law;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.miicaa.home.R.id;
import com.miicaa.home.R.layout;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class LawBasisActivity_
    extends LawBasisActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.layout_law_basis);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static LawBasisActivity_.IntentBuilder_ intent(Context context) {
        return new LawBasisActivity_.IntentBuilder_(context);
    }

    public static LawBasisActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new LawBasisActivity_.IntentBuilder_(fragment);
    }

    public static LawBasisActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new LawBasisActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        dapartNum = ((EditText) hasViews.findViewById(id.dapartNum));
        lawBasisType = ((TextView) hasViews.findViewById(id.lawBasisType));
        lawBasisNum = ((TextView) hasViews.findViewById(id.lawBasisNum));
        lawBasisTopic = ((EditText) hasViews.findViewById(id.lawBasisTopic));
        lawBasisContent = ((EditText) hasViews.findViewById(id.lawBasisContent));
        lawBasisTypeLayout = hasViews.findViewById(id.lawBasisTypeLayout);
        lawBasisNumLayout = hasViews.findViewById(id.lawBasisNumLayout);
        submit = ((Button) hasViews.findViewById(id.submit));
        lawBasisTitle = ((EditText) hasViews.findViewById(id.lawBasisTitle));
        {
            View view = hasViews.findViewById(id.submit);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        LawBasisActivity_.this.submit();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.add);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        LawBasisActivity_.this.add();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.lawBasisTypeLayout);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        LawBasisActivity_.this.lawBasisTypeLayout();
                    }

                }
                );
            }
        }
        initUI();
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;
        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, LawBasisActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            fragment_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, LawBasisActivity_.class);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            fragmentSupport_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, LawBasisActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public LawBasisActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent_, requestCode);
            } else {
                if (fragment_!= null) {
                    fragment_.startActivityForResult(intent_, requestCode);
                } else {
                    if (context_ instanceof Activity) {
                        ((Activity) context_).startActivityForResult(intent_, requestCode);
                    } else {
                        context_.startActivity(intent_);
                    }
                }
            }
        }

    }

}

    
    
}