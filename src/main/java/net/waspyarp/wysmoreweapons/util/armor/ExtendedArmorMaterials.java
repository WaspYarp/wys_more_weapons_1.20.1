package net.waspyarp.wysmoreweapons.util.armor;

import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public enum ExtendedArmorMaterials implements ArmorMaterial {

    WYS_ARCHER_ARMOR("wys_archer_armor", 17, makeArmorMap(2, 5, 3, 1), 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> Ingredient.of(Items.IRON_INGOT), Map.of(
    )),
    WYS_HORSEMAN_ARMOR("wys_horseman_armor", 17, makeArmorMap(2, 5, 4, 1), 15, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> Ingredient.of(Items.IRON_INGOT), Map.of(
    )),
    WYS_IRON_ARMOR("wys_iron_armor", 17, makeArmorMap(2, 6, 5, 2), 12, SoundEvents.ARMOR_EQUIP_IRON, 0.5F, 0.0F, () -> Ingredient.of(Items.IRON_INGOT), Map.of(
    )),
    WYS_DIAMOND_ARMOR("wys_diamond_armor", 35, makeArmorMap(3, 8, 6, 3), 13, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F, 0.05F, () -> Ingredient.of(Items.DIAMOND), Map.of(
    )),
    WYS_NETHERITE_ARMOR("wys_netherite_armor", 39, makeArmorMap(4, 8, 6, 3), 18, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.5F, 0.15F, () -> Ingredient.of(Items.NETHERITE_INGOT), Map.of(
    )),
    WYS_KING_ARMOR("wys_king_armor", 39, makeArmorMap(4, 9, 7, 4), 28, SoundEvents.ARMOR_EQUIP_GOLD, 3.0F, 0.1F, () -> Ingredient.of(Items.DIAMOND), Map.of(
            Attributes.MAX_HEALTH, new AttributeModifier("more health", 1, AttributeModifier.Operation.ADDITION)
    )),
    WYS_NETHERITE_KING_ARMOR("wys_netherite_king_armor", 42, makeArmorMap(5, 9, 7, 4), 33, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.2F, () -> Ingredient.of(Items.NETHERITE_INGOT), Map.of(
            Attributes.MAX_HEALTH, new AttributeModifier("more health", 2, AttributeModifier.Operation.ADDITION)
    ));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;
    private final Map<Attribute, AttributeModifier> additionalAttributes;

    private ExtendedArmorMaterials(String pName, int pDurabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionMap, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient, Map<Attribute, AttributeModifier> additionalAttributes) {
        this.name = pName;
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.protectionFunctionForType = protectionMap;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
        this.additionalAttributes = additionalAttributes;
    }

    static public EnumMap<ArmorItem.Type, Integer> makeArmorMap(int helmet, int chestplate, int leggings, int boots) {
        return Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266655_) -> {
            p_266655_.put(ArmorItem.Type.BOOTS, boots);
            p_266655_.put(ArmorItem.Type.LEGGINGS, leggings);
            p_266655_.put(ArmorItem.Type.CHESTPLATE, chestplate);
            p_266655_.put(ArmorItem.Type.HELMET, helmet);
        });
    }

    static public EnumMap<ArmorItem.Type, Integer> schoolArmorMap() {
        return makeArmorMap(3, 8, 6, 3);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266653_) -> {
        p_266653_.put(ArmorItem.Type.BOOTS, 13);
        p_266653_.put(ArmorItem.Type.LEGGINGS, 15);
        p_266653_.put(ArmorItem.Type.CHESTPLATE, 16);
        p_266653_.put(ArmorItem.Type.HELMET, 11);
    });

    public int getDurabilityForType(ArmorItem.Type p_266745_) {
        return HEALTH_FUNCTION_FOR_TYPE.get(p_266745_) * this.durabilityMultiplier;
    }

    public int getDefenseForType(ArmorItem.Type p_266752_) {
        return this.protectionFunctionForType.get(p_266752_);
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public Map<Attribute, AttributeModifier> getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * Gets the percentage of knockback resistance provided by armor of the material.
     */
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}