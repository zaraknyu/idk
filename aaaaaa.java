zarakinyu@DESKTOP-E35KJB8:~/android_device_xiaomi_warm$ git grep -i warm
AndroidProducts.mk:    $(LOCAL_DIR)/lineage_warm.mk
BoardConfig.mk:DEVICE_PATH := device/xiaomi/warm
BoardConfig.mk:TARGET_BOOTLOADER_BOARD_NAME := warm
BoardConfig.mk:TARGET_RECOVERY_DEVICE_MODULES := init_xiaomi_warm
BoardConfig.mk:include vendor/xiaomi/warm/BoardConfigVendor.mk
board-info.txt:require board=pitti|warm
device.mk:    init.warm.rc \
device.mk:$(call soong_config_set,libinit,vendor_init_lib,//$(LOCAL_PATH):init_xiaomi_warm)
device.mk:    ApertureOverlayWarm \
device.mk:    CarrierConfigOverlayWarm \
device.mk:    FrameworkOverlayWarm \
device.mk:    LineageDialerOverlayWarm \
device.mk:    LineageSDKOverlayWarm \
device.mk:    LineageSettingsOverlayWarm \
device.mk:    SettingsOverlayWarm \
device.mk:    SettingsProviderOverlayWarmPOCO \
device.mk:    SettingsProviderOverlayWarmRedmi \
device.mk:    SystemUIOverlayWarm \
device.mk:    TelephonyOverlayWarm \
device.mk:    WifiOverlayWarm \
device.mk:    WifiOverlayWarmPOCO \
device.mk:    WifiOverlayWarmRedmi
device.mk:$(call inherit-product, vendor/xiaomi/warm/warm-vendor.mk)
extract-files.py:    'warm',
libinit/Android.bp:    name: "libinit_xiaomi_warm",
libinit/Android.bp:    name: "init_xiaomi_warm",
libinit/Android.bp:    srcs: ["init_xiaomi_warm.cpp"],
libinit/Android.bp:    whole_static_libs: ["libinit_xiaomi_warm"],
libinit/init_xiaomi_warm.cpp:static const variant_info_t warm_info = {
libinit/init_xiaomi_warm.cpp:    .sku_value = "warm",
libinit/init_xiaomi_warm.cpp:    .device = "warm",
libinit/init_xiaomi_warm.cpp:    .build_fingerprint = "Redmi/warm_global/warm:15/AQ3A.241213.002/OS2.0.203.0.VGVINXM:user/release-keys"
libinit/init_xiaomi_warm.cpp:static const variant_info_t warm_p_info = {
libinit/init_xiaomi_warm.cpp:    .sku_value = "warm_p",
libinit/init_xiaomi_warm.cpp:    .device = "warm",
libinit/init_xiaomi_warm.cpp:    .build_fingerprint = "POCO/warm_p_global/warm:15/AQ3A.241213.002/OS2.0.203.0.VGVINXM:user/release-keys"
libinit/init_xiaomi_warm.cpp:    warm_info,
libinit/init_xiaomi_warm.cpp:    warm_p_info,
lineage_warm.mk:# Inherit from warm device
lineage_warm.mk:$(call inherit-product, device/xiaomi/warm/device.mk)
lineage_warm.mk:PRODUCT_NAME := lineage_warm
lineage_warm.mk:PRODUCT_DEVICE := warm
lineage_warm.mk:PRODUCT_SYSTEM_NAME := warm_global
lineage_warm.mk:PRODUCT_SYSTEM_DEVICE := warm
lineage_warm.mk:    BuildDesc="warm_global-user 15 AQ3A.241213.002 OS2.0.203.0.VGVINXM release-keys" \
lineage_warm.mk:    BuildFingerprint=POCO/warm_global/warm:15/AQ3A.241213.002/OS2.0.203.0.VGVINXM:user/release-keys \
overlay/ApertureOverlayWarm/Android.bp:    name: "ApertureOverlayWarm",
overlay/ApertureOverlayWarm/AndroidManifest.xml:    package="org.lineageos.aperture.warm">
overlay/CarrierConfigOverlayWarm/Android.bp:    name: "CarrierConfigOverlayWarm",
overlay/CarrierConfigOverlayWarm/AndroidManifest.xml:    package="com.android.carrierconfig.overlay.warm">
overlay/FrameworkOverlayWarm/Android.bp:    name: "FrameworkOverlayWarm",
overlay/FrameworkOverlayWarm/AndroidManifest.xml:    package="android.overlay.warm">
overlay/LineageDialerOverlayWarm/Android.bp:    name: "LineageDialerOverlayWarm",
overlay/LineageDialerOverlayWarm/AndroidManifest.xml:    package="com.android.dialer.overlay.warm">
overlay/LineageSDKOverlayWarm/Android.bp:    name: "LineageSDKOverlayWarm",
overlay/LineageSDKOverlayWarm/AndroidManifest.xml:    package="lineageos.platform.warm">
overlay/LineageSettingsOverlayWarm/Android.bp:    name: "LineageSettingsOverlayWarm",
overlay/LineageSettingsOverlayWarm/AndroidManifest.xml:    package="com.android.settings.lineage.overlay.warm">
overlay/SettingsOverlayWarm/Android.bp:    name: "SettingsOverlayWarm",
overlay/SettingsOverlayWarm/AndroidManifest.xml:    package="com.android.settings.overlay.warm">
overlay/SettingsProviderOverlayWarm/Android.bp:    name: "SettingsProviderOverlayWarmPOCO",
overlay/SettingsProviderOverlayWarm/Android.bp:    name: "SettingsProviderOverlayWarmRedmi",
overlay/SettingsProviderOverlayWarm/AndroidManifest-POCO.xml:    package="com.android.settingsproviders.warm.poco">
overlay/SettingsProviderOverlayWarm/AndroidManifest-Redmi.xml:    package="com.android.settingsproviders.warm.redmi">
overlay/SystemUIOverlayWarm/Android.bp:    name: "SystemUIOverlayWarm",
overlay/SystemUIOverlayWarm/AndroidManifest.xml:    package="com.android.systemui.overlay.warm">
overlay/TelephonyOverlayWarm/Android.bp:    name: "TelephonyOverlayWarm",
overlay/TelephonyOverlayWarm/AndroidManifest.xml:    package="com.android.phone.overlay.warm">
overlay/WifiOverlayWarm/Android.bp:    name: "WifiOverlayWarm",
overlay/WifiOverlayWarm/Android.bp:    name: "WifiOverlayWarmPOCO",
overlay/WifiOverlayWarm/Android.bp:    name: "WifiOverlayWarmRedmi",
overlay/WifiOverlayWarm/AndroidManifest-POCO.xml:    package="com.android.wifi.resources.overlay.warm.poco">
overlay/WifiOverlayWarm/AndroidManifest-Redmi.xml:    package="com.android.wifi.resources.overlay.warm.redmi">
overlay/WifiOverlayWarm/AndroidManifest.xml:    package="com.android.wifi.resources.overlay.warm">
props/odm.prop:ro.product.odm.name=warm_global
props/system.prop:ro.product.mod_device=warm_global
rootdir/Android.bp:    name: "init.warm.rc",
rootdir/Android.bp:    src: "etc/init.warm.rc",
zarakinyu@DESKTOP-E35KJB8:~/android_device_xiaomi_warm$ git grep -i DEVICE_PATH
BoardConfig.mk:DEVICE_PATH := device/xiaomi/warm
BoardConfig.mk:KERNEL_PATH := $(DEVICE_PATH)-kernel
BoardConfig.mk:BOARD_BLUETOOTH_BDROID_BUILDCFG_INCLUDE_DIR := $(DEVICE_PATH)/bluetooth/include
BoardConfig.mk:TARGET_FS_CONFIG_GEN := $(DEVICE_PATH)/configs/config.fs
BoardConfig.mk:    $(DEVICE_PATH)/hidl/compatibility_matrix.device.xml \
BoardConfig.mk:DEVICE_FRAMEWORK_MANIFEST_FILE := $(DEVICE_PATH)/hidl/framework_manifest.xml
BoardConfig.mk:DEVICE_MATRIX_FILE := $(DEVICE_PATH)/hidl/compatibility_matrix.xml
BoardConfig.mk:    $(DEVICE_PATH)/hidl/manifest_vendor.xml \
BoardConfig.mk:TARGET_ODM_PROP += $(DEVICE_PATH)/props/odm.prop
BoardConfig.mk:TARGET_PRODUCT_PROP += $(DEVICE_PATH)/props/product.prop
BoardConfig.mk:TARGET_SYSTEM_PROP += $(DEVICE_PATH)/props/system.prop
BoardConfig.mk:TARGET_VENDOR_PROP += $(DEVICE_PATH)/props/vendor.prop
BoardConfig.mk:TARGET_RECOVERY_FSTAB := $(DEVICE_PATH)/rootdir/etc/fstab.default
zarakinyu@DESKTOP-E35KJB8:~/android_device_xiaomi_warm$
