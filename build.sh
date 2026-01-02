#!/bin/bash

# Repo Init
repo init -u https://github.com/LineageOS/android.git -b lineage-23.0 --git-lfs
repo sync -c -j$(nproc --all) --force-sync --no-tags --no-clone-bundle --prune

# Removing used directories
rm -rf device/xiaomi/warm
rm -rf device/xiaomi/warm-kernel
rm -rf vendor/xiaomi/warm
rm -rf hardware/qcom-caf/common
rm -rf hardware/xiaomi

git clone https://github.com/sm4635-development/android_device_xiaomi_warm -b lineage-23.0 device/xiaomi/warm
git clone https://github.com/sm4635-development/android_vendor_xiaomi_warm -b lineage-23.0 vendor/xiaomi/warm
git clone https://github.com/sm4635-development/android_device_xiaomi_warm-kernel -b lineage-23.0 device/xiaomi/warm-kernel
git clone https://github.com/LineageOS/android_hardware_xiaomi -b lineage-23.0 hardware/xiaomi
git clone https://github.com/sm4635-development/android_hardware_qcom-caf_common -b lineage-23.0 hardware/qcom-caf/common

# Building
source build/envsetup.sh
lunch lineage_warm-bp2a-userdebug
mka bacon -j$(nproc --all)

# Upload file to TMP GOFILE
echo "THIS IS NOW UPLOADING TO GOFILE IF BALWINDAR IS SLEEPING AF LMAOOOOOOOOOOOOOOOOOO"
echo "STILL IN PROGESS"


curl -F "file=@out/target/product/warm/lineage-23.0*UNOFFICIAL*.zip" https://store2.gofile.io/uploadFile


echo "DONE UPLOADING TO GOFILE, BALWINDAR,thoda kashth krke link bhej dijiye, lazy boi"
