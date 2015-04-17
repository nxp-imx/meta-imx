# Ugly patch as Poky's fido branch does not include the patch for utils.py

RDEPENDS_packagegroup-base += "\
    ${@bb.utils.contains('COMBINED_FEATURES', "set(['alsa'])", 'packagegroup-base-alsa', '',d)} \
    ${@bb.utils.contains('COMBINED_FEATURES', "set(['ext2'])", 'packagegroup-base-ext2', '',d)} \
    ${@bb.utils.contains('COMBINED_FEATURES', "set(['vfat'])", 'packagegroup-base-vfat', '',d)} \
    ${@bb.utils.contains('COMBINED_FEATURES', "set(['irda'])", 'packagegroup-base-irda', '',d)} \
    ${@bb.utils.contains('COMBINED_FEATURES', "set(['pci'])", 'packagegroup-base-pci', '',d)} \
    ${@bb.utils.contains('COMBINED_FEATURES', "set(['pcmcia'])", 'packagegroup-base-pcmcia', '',d)} \
    ${@bb.utils.contains('COMBINED_FEATURES', "set(['usbgadget'])", 'packagegroup-base-usbgadget', '',d)} \
    ${@bb.utils.contains('COMBINED_FEATURES', "set(['usbhost'])", 'packagegroup-base-usbhost', '',d)} \
    ${@bb.utils.contains('COMBINED_FEATURES', "set(['bluetooth'])", 'packagegroup-base-bluetooth', '',d)} \
    ${@bb.utils.contains('COMBINED_FEATURES', "set(['wifi'])", 'packagegroup-base-wifi', '',d)} \
    ${@bb.utils.contains('COMBINED_FEATURES', "set(['3g'])", 'packagegroup-base-3g', '',d)} \
    ${@bb.utils.contains('COMBINED_FEATURES', "set(['nfc'])", 'packagegroup-base-nfc', '',d)} \
"

RDEPENDS_packagegroup-base-bluetooth = "\
    ${VIRTUAL-RUNTIME_virtual/bluez} \
    ${@bb.utils.contains('COMBINED_FEATURES', "set(['alsa'])", 'libasound-module-bluez', '',d)} \
   "

