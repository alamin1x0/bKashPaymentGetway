// Generated by view binder compiler. Do not edit!
package com.example.bkash_tokenized_android_kotlin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bkash_tokenized_android_kotlin.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSearchBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView amountSearch;

  @NonNull
  public final TextView completedTimeSearch;

  @NonNull
  public final TextView customerMsisdnSearch;

  @NonNull
  public final TextView initiationTimeSearch;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final Button searchBtn;

  @NonNull
  public final TextView statusMessageSearch;

  @NonNull
  public final EditText textView2Search;

  @NonNull
  public final TextView transactionStatusSearch;

  @NonNull
  public final TextView transactionTypeSearch;

  @NonNull
  public final TextView trxIDSearch;

  private FragmentSearchBinding(@NonNull ConstraintLayout rootView, @NonNull TextView amountSearch,
      @NonNull TextView completedTimeSearch, @NonNull TextView customerMsisdnSearch,
      @NonNull TextView initiationTimeSearch, @NonNull LinearLayout linearLayout,
      @NonNull Button searchBtn, @NonNull TextView statusMessageSearch,
      @NonNull EditText textView2Search, @NonNull TextView transactionStatusSearch,
      @NonNull TextView transactionTypeSearch, @NonNull TextView trxIDSearch) {
    this.rootView = rootView;
    this.amountSearch = amountSearch;
    this.completedTimeSearch = completedTimeSearch;
    this.customerMsisdnSearch = customerMsisdnSearch;
    this.initiationTimeSearch = initiationTimeSearch;
    this.linearLayout = linearLayout;
    this.searchBtn = searchBtn;
    this.statusMessageSearch = statusMessageSearch;
    this.textView2Search = textView2Search;
    this.transactionStatusSearch = transactionStatusSearch;
    this.transactionTypeSearch = transactionTypeSearch;
    this.trxIDSearch = trxIDSearch;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.amountSearch;
      TextView amountSearch = ViewBindings.findChildViewById(rootView, id);
      if (amountSearch == null) {
        break missingId;
      }

      id = R.id.completedTimeSearch;
      TextView completedTimeSearch = ViewBindings.findChildViewById(rootView, id);
      if (completedTimeSearch == null) {
        break missingId;
      }

      id = R.id.customerMsisdnSearch;
      TextView customerMsisdnSearch = ViewBindings.findChildViewById(rootView, id);
      if (customerMsisdnSearch == null) {
        break missingId;
      }

      id = R.id.initiationTimeSearch;
      TextView initiationTimeSearch = ViewBindings.findChildViewById(rootView, id);
      if (initiationTimeSearch == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.searchBtn;
      Button searchBtn = ViewBindings.findChildViewById(rootView, id);
      if (searchBtn == null) {
        break missingId;
      }

      id = R.id.statusMessageSearch;
      TextView statusMessageSearch = ViewBindings.findChildViewById(rootView, id);
      if (statusMessageSearch == null) {
        break missingId;
      }

      id = R.id.textView2Search;
      EditText textView2Search = ViewBindings.findChildViewById(rootView, id);
      if (textView2Search == null) {
        break missingId;
      }

      id = R.id.transactionStatusSearch;
      TextView transactionStatusSearch = ViewBindings.findChildViewById(rootView, id);
      if (transactionStatusSearch == null) {
        break missingId;
      }

      id = R.id.transactionTypeSearch;
      TextView transactionTypeSearch = ViewBindings.findChildViewById(rootView, id);
      if (transactionTypeSearch == null) {
        break missingId;
      }

      id = R.id.trxIDSearch;
      TextView trxIDSearch = ViewBindings.findChildViewById(rootView, id);
      if (trxIDSearch == null) {
        break missingId;
      }

      return new FragmentSearchBinding((ConstraintLayout) rootView, amountSearch,
          completedTimeSearch, customerMsisdnSearch, initiationTimeSearch, linearLayout, searchBtn,
          statusMessageSearch, textView2Search, transactionStatusSearch, transactionTypeSearch,
          trxIDSearch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}