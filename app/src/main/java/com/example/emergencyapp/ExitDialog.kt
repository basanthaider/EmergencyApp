package com.example.emergencyapp

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class ExitDialog:DialogFragment() {


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder= AlertDialog.Builder(activity)
            .setIcon(android.R.drawable.ic_menu_close_clear_cancel)
            .setTitle(getString(R.string.dialog_exit_title))
            .setMessage(getString(R.string.dialog_msg))
            .setPositiveButton(getString(R.string.positive_ans)) { _, _ -> activity?.finish() }
            .setNegativeButton(getString(R.string.negative_ans)){ dialog, _ ->dialog.dismiss()}
        return builder.create()
    }

}
