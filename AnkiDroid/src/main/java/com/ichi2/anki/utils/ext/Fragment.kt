/*
 *  Copyright (c) 2024 Brayan Oliveira <brayandso.dev@gmail.com>
 *
 *  This program is free software; you can redistribute it and/or modify it under
 *  the terms of the GNU General Public License as published by the Free Software
 *  Foundation; either version 3 of the License, or (at your option) any later
 *  version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT ANY
 *  WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 *  PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along with
 *  this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.ichi2.anki.utils.ext

import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.view.Window
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.ichi2.anki.preferences.sharedPrefs
import com.ichi2.anki.utils.showDialogFragmentImpl

fun Fragment.sharedPrefs(): SharedPreferences = requireContext().sharedPrefs()

val Fragment.packageManager: PackageManager
    get() = requireContext().packageManager

/**
 * Method to show dialog fragment including adding it to back stack
 *
 * @see showDialogFragmentImpl
 */
fun Fragment.showDialogFragment(newFragment: DialogFragment) = requireActivity().showDialogFragment(newFragment)

/** @see FragmentActivity.getWindow */
val Fragment.window: Window
    get() = requireActivity().window
