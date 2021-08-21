package com.virtualstudios.firestorechat.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.virtualstudios.firestorechat.databinding.ActivityChatBinding;
import com.virtualstudios.firestorechat.models.User;
import com.virtualstudios.firestorechat.utilities.Constants;

public class ChatActivity extends AppCompatActivity {

    private ActivityChatBinding binding;
    private User receiverUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadReceiverDetails();
        setListeners();
    }

    private void loadReceiverDetails(){
        receiverUser = (User) getIntent().getSerializableExtra(Constants.KEY_USER);
        binding.textName.setText(receiverUser.name);
    }

    private void setListeners(){
        binding.imageBack.setOnClickListener(view -> onBackPressed());
    }
}