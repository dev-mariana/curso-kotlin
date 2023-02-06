package repository

import entity.ContactEntity

class ContactRepository {
    companion object {
        private val contactList = mutableListOf<ContactEntity>()

        fun save(contact: ContactEntity) {
            contactList.add(contact)
        }

        fun delete(contact: ContactEntity) {
            val list = getList()
            var index = -1

            for(item in list.withIndex()) {
                if(item.value.name == contact.name && item.value.phone == contact.phone) {
                    index = item.index
                }
            }
            contactList.removeAt(index)
        }

        fun getList(): List<ContactEntity> {
            return contactList
        }
    }
}