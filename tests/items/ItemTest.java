package items;

import character.Warrior;
import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void equipWeapon_tryAndEquipToHighLevelWeapon_invalidWeaponException(){
        Warrior warrior = new Warrior("warrior");
        Weapon weapon = new Weapon(Slot.WEAPON, 2, "Axe", WeaponType.AXE, 7, 1.1);

        assertThrows(InvalidWeaponException.class, () ->{
            warrior.equipWeapon(weapon);
        });
    }

    @Test
    void equipArmor_tryAndEquipToHighLevelArmor_invalidArmorException(){
        Warrior warrior = new Warrior("warrior");
        Armor armor = new Armor(Slot.BODY, 2, "Body", ArmorType.PLATE, 1,2,3,4);

        assertThrows(InvalidArmorException.class, () ->{
            warrior.equipArmor(armor);
        });
    }
    @Test
    void equipWeapon_tryEquipWrongWeaponType_invalidWeaponException(){
        Warrior warrior = new Warrior("warrior");
        Weapon weapon = new Weapon(Slot.WEAPON, 2, "BOW", WeaponType.BOW, 7, 1.1);

        assertThrows(InvalidWeaponException.class, () ->{
            warrior.equipWeapon(weapon);
        });
}

    @Test
    void equipArmor_tryAndEquipWrongArmor_invalidArmorException(){
        Warrior warrior = new Warrior("warrior");
        Armor armor = new Armor(Slot.BODY, 2, "Body", ArmorType.CLOTH, 1,2,3,4);

        assertThrows(InvalidArmorException.class, () ->{
            warrior.equipArmor(armor);
        });
    }
}


