package uz.silence.fragmentpagerpracticeone.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import uz.silence.fragmentpagerpracticeone.CLASS.User
import uz.silence.fragmentpagerpracticeone.UserFragment

class UserPagerAdapters(
    var userList: ArrayList<User>,
    var titleList: ArrayList<String>,
    fragmentManager: FragmentManager
) :
    FragmentStatePagerAdapter(
        fragmentManager,
        BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
    ) {
    override fun getCount(): Int {
        return userList.size
    }

    override fun getItem(position: Int): Fragment {
        return UserFragment.newInstance(userList[position])
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }

}