# Provides the i.MX common settings

include conf/machine/include/fsl-default-settings.inc
include conf/machine/include/fsl-default-versions.inc

require conf/machine/include/utilities.inc

IMAGE_CLASSES += "image_types_create_sdcard_symlink"

# Set specific make target and binary suffix
PREFERRED_PROVIDER_u-boot ??= "u-boot-fslc"
PREFERRED_PROVIDER_virtual/bootloader ??= "u-boot-fslc"

PREFERRED_PROVIDER_u-boot-mxsboot-native ??= "u-boot-fslc-mxsboot-native"

UBOOT_BINARY ?= "u-boot.imx"
UBOOT_BINARY_mx8 ?= "u-boot.bin"
UBOOT_MAKE_TARGET ?= "u-boot.imx"
UBOOT_MAKE_TARGET_mxs ?= "u-boot.sb"

UBOOT_SUFFIX ?= "imx"
UBOOT_SUFFIX_mxs ?= "sb"
UBOOT_SUFFIX_mx8 ?= "bin"

UBOOT_ENTRYPOINT_mxs = "0x40008000"
UBOOT_ENTRYPOINT_mx51  = "0x90008000"
UBOOT_ENTRYPOINT_mx53  = "0x70008000"
UBOOT_ENTRYPOINT_mx6  = "0x10008000"
UBOOT_ENTRYPOINT_mx6sl = "0x80008000"
UBOOT_ENTRYPOINT_mx6sll = "0x80008000"
UBOOT_ENTRYPOINT_mx6sx = "0x80008000"
UBOOT_ENTRYPOINT_mx6ul  = "0x10008000"
UBOOT_ENTRYPOINT_mx6ull  = "0x10008000"
UBOOT_ENTRYPOINT_mx6ulz  = "0x10008000"
UBOOT_ENTRYPOINT_mx7 = "0x80008000"
UBOOT_ENTRYPOINT_vf = "0x80008000"

PREFERRED_PROVIDER_virtual/xserver = "xserver-xorg"
XSERVER_DRIVER            = "xf86-video-fbdev"
XSERVER_DRIVER_imxgpu2d   = "xf86-video-imx-vivante"
XSERVER_DRIVER_vf         = "xf86-video-modesetting"
XSERVER_DRIVER_append_mx8 = " xf86-video-modesetting"
XSERVER = "xserver-xorg \
           xf86-input-evdev \
           ${XSERVER_DRIVER}"

# Ship kernel modules
MACHINE_EXTRA_RRECOMMENDS = "kernel-modules"

# Tunes for hard/soft float-point selection. Note that we allow building for
# thumb support giving distros the chance to enable thumb by setting
# ARM_INSTRUCTION_SET = "thumb"
#
# handled by software
# DEFAULTTUNE_mx6 ?= "cortexa9t-neon"
# handled by hardware
DEFAULTTUNE_mx6 ?= "cortexa9thf-neon"
DEFAULTTUNE_mx6ul ?= "cortexa7thf-neon"
DEFAULTTUNE_mx6ull ?= "cortexa7thf-neon"
DEFAULTTUNE_mx6ulz ?= "cortexa7thf-neon"
DEFAULTTUNE_mx7 ?= "cortexa7thf-neon"
DEFAULTTUNE_mx8 ?= "aarch64"
DEFAULTTUNE_vf ?= "cortexa5thf-neon"

INHERIT += "machine-overrides-extender"

MACHINEOVERRIDES_EXTENDER_mx6q   = "imxfbdev:imxipu:imxvpu:imxvpucnm:imxgpu:imxgpu2d:imxgpu3d"
MACHINEOVERRIDES_EXTENDER_mx6dl  = "imxfbdev:imxipu:imxpxp:imxvpu:imxvpucnm:imxgpu:imxgpu2d:imxgpu3d:imxepdc"
MACHINEOVERRIDES_EXTENDER_mx6sx  = "imxfbdev:imxpxp:imxgpu:imxgpu2d:imxgpu3d"
MACHINEOVERRIDES_EXTENDER_mx6sl  = "imxfbdev:imxpxp:imxgpu:imxgpu2d:imxepdc"
MACHINEOVERRIDES_EXTENDER_mx6sll = "imxfbdev:imxpxp:imxepdc"
MACHINEOVERRIDES_EXTENDER_mx6ul  = "imxfbdev:imxpxp"
MACHINEOVERRIDES_EXTENDER_mx6ull = "imxfbdev:imxpxp:imxepdc"
MACHINEOVERRIDES_EXTENDER_mx6ulz = "imxfbdev:imxpxp:imxepdc"
MACHINEOVERRIDES_EXTENDER_mx7d   = "imxfbdev:imxpxp:imxepdc"
MACHINEOVERRIDES_EXTENDER_mx7ulp = "imxfbdev:imxpxp:imxgpu:imxgpu2d:imxgpu3d"
MACHINEOVERRIDES_EXTENDER_mx8mq  = "imxdrm:imxdcss:imxvpu:imxvpuhantro:imxgpu:imxgpu3d"
MACHINEOVERRIDES_EXTENDER_mx8mm  = "imxdrm:imxvpu:imxvpuhantro:imxgpu:imxgpu2d:imxgpu3d"
MACHINEOVERRIDES_EXTENDER_mx8mn  = "imxdrm:imxgpu:imxgpu3d"
MACHINEOVERRIDES_EXTENDER_mx8qm  = "imxdrm:imxdpu:imxgpu:imxgpu2d:imxgpu3d:imxopenvx"
MACHINEOVERRIDES_EXTENDER_mx8qxp = "imxdrm:imxdpu:imxgpu:imxgpu2d:imxgpu3d"


# Sub-architecture support
MACHINE_SOCARCH_SUFFIX ?= ""
MACHINE_SOCARCH_SUFFIX_mx6q = "-mx6qdl"
MACHINE_SOCARCH_SUFFIX_mx6dl = "-mx6qdl"
MACHINE_SOCARCH_SUFFIX_mx6sx = "-mx6sx"
MACHINE_SOCARCH_SUFFIX_mx6sl = "-mx6sl"
MACHINE_SOCARCH_SUFFIX_mx6sll = "-mx6sll"
MACHINE_SOCARCH_SUFFIX_mx7d = "-mx7d"
MACHINE_SOCARCH_SUFFIX_mx7ulp = "-mx7ulp"
MACHINE_SOCARCH_SUFFIX_vf60 = "-vf60"
MACHINE_SOCARCH_SUFFIX_vf50 = "-vf50"
MACHINE_SOCARCH_SUFFIX_mx6ul  = "-mx6ul"
MACHINE_SOCARCH_SUFFIX_mx6ull = "-mx6ul"
MACHINE_SOCARCH_SUFFIX_mx6ulz = "-mx6ul"
MACHINE_SOCARCH_SUFFIX_mx8mm  = "-mx8mm"
MACHINE_SOCARCH_SUFFIX_mx8mn  = "-mx8mn"
MACHINE_SOCARCH_SUFFIX_mx8mq  = "-mx8m"
MACHINE_SOCARCH_SUFFIX_mx8qm  = "-mx8"
MACHINE_SOCARCH_SUFFIX_mx8qxp = "-mx8"

MACHINE_ARCH_FILTER = "virtual/kernel"
MACHINE_SOCARCH_FILTER_append_imxvpu = " \
    imx-codec \
    imx-vpu \
    imx-vpuwrap \
    libimxvpuapi \
"
MACHINE_SOCARCH_FILTER_append_imxgpu = " \
    virtual/egl \
    virtual/mesa \
    virtual/libg2d \
    libgal-imx \
    virtual/libopenvg \
    cairo \
    opencv \
    pango \
"

MACHINE_SOCARCH_FILTER_append_imxgpu3d = " \
    virtual/libgl \
    virtual/libgles1 \
    virtual/libgles2 \
"
MACHINE_SOCARCH_FILTER_append_mx6q = " \
    virtual/opencl-icd \
    opencl-headers \
"
MACHINE_SOCARCH_FILTER_append_mx8 = " \
    virtual/libopenvx \
    virtual/opencl-icd \
    opencl-headers \
"
MACHINE_SOCARCH_FILTER_append_imxpxp = " \
    imx-codec \
"

INHERIT += "fsl-dynamic-packagearch"

SIGGEN_EXCLUDE_SAFE_RECIPE_DEPS_append = " \
    imx-gpu-viv->kernel-module-imx-gpu-viv \
    libimxvpuapi->imx-vpu \
    imx-vpuwrap->imx-vpu \
    imx-codec->imx-vpu \
    imx-test->imx-vpu \
"

# Firmware
MACHINE_FIRMWARE ?= ""
MACHINE_FIRMWARE_append_mx6 = " firmware-imx-sdma"
MACHINE_FIRMWARE_append_mx7 = " firmware-imx-epdc firmware-imx-sdma"
MACHINE_FIRMWARE_append_mx6q = " firmware-imx-vpu-imx6q"
MACHINE_FIRMWARE_append_mx6dl = " firmware-imx-vpu-imx6d firmware-imx-epdc"
MACHINE_FIRMWARE_append_mx6sl = " firmware-imx-epdc"
MACHINE_FIRMWARE_append_mx6ull = " firmware-imx-epdc"
MACHINE_FIRMWARE_append_mx6ulz = " firmware-imx-epdc"
MACHINE_FIRMWARE_append_mx53 = " firmware-imx-vpu-imx53 firmware-imx-sdma-imx53"
MACHINE_FIRMWARE_append_mx51 = " firmware-imx-vpu-imx51 firmware-imx-sdma-imx51"
MACHINE_FIRMWARE_append_mx8  = " linux-firmware-ath10k firmware-imx-sdma"
MACHINE_FIRMWARE_append_mx8qm  = " firmware-imx-vpu-imx8"
MACHINE_FIRMWARE_append_mx8qxp  = " firmware-imx-vpu-imx8"
# Extra Cypress Wi-Fi and BTW firmware (Murata)
MACHINE_FIRMWARE_append = " ${@bb.utils.contains('MACHINE_FEATURES', 'bcm4339', 'linux-firmware-bcm4339', '', d)}"
MACHINE_FIRMWARE_append = " ${@bb.utils.contains('MACHINE_FEATURES', 'bcm43430', 'linux-firmware-bcm43430', '', d)}"
MACHINE_FIRMWARE_append = " ${@bb.utils.contains('MACHINE_FEATURES', 'bcm43455', 'linux-firmware-bcm43455', '', d)}"
MACHINE_FIRMWARE_append = " ${@bb.utils.contains('MACHINE_FEATURES', 'bcm4356', 'linux-firmware-bcm4356-pcie', '', d)}"
MACHINE_FIRMWARE_append = " ${@bb.utils.contains('MACHINE_FEATURES', 'bcm4359', 'linux-firmware-bcm4359-pcie', '', d)}"

# FIXME: Needs addition of firmware-imx of official BSPs
#MACHINE_FIRMWARE_append_mx27 = " firmware-imx-vpu-imx27"
#MACHINE_FIRMWARE_append_mx25 = " firmware-imx-sdma-imx25"

MACHINE_EXTRA_RRECOMMENDS += "${MACHINE_FIRMWARE}"

# Extra QCA Wi-Fi & BTE driver and firmware
MACHINE_EXTRA_RRECOMMENDS_append = " ${@bb.utils.contains('MACHINE_FEATURES', 'qca6174', 'kernel-module-qca6174 firmware-qca6174 qca-tools', '', d)}"
MACHINE_EXTRA_RRECOMMENDS_append = " ${@bb.utils.contains('MACHINE_FEATURES', 'qca9377', 'kernel-module-qca9377 firmware-qca9377 qca-tools', '', d)}"

# Extra audio support
# FIXME: Add support for ALL SoC families
MACHINE_EXTRA_RRECOMMENDS_append_mx6dl = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"
MACHINE_EXTRA_RRECOMMENDS_append_mx6q = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"
MACHINE_EXTRA_RRECOMMENDS_append_mx6sl = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"
MACHINE_EXTRA_RRECOMMENDS_append_mx6sx = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"
MACHINE_EXTRA_RRECOMMENDS_append_mx6ul = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"
MACHINE_EXTRA_RRECOMMENDS_append_mx6ull = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"
MACHINE_EXTRA_RRECOMMENDS_append_mx6ulz = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"
MACHINE_EXTRA_RRECOMMENDS_append_mx7d = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"

# Extra udev rules
MACHINE_EXTRA_RRECOMMENDS += "udev-rules-imx"

# GStreamer 1.0 plugins
MACHINE_GSTREAMER_1_0_PLUGIN_mx6q = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6dl = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sl = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sll = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sx = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6ul = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx7d = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx7ulp = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx8 = "imx-gst1.0-plugin"

# Handle Vivante kernel driver setting:
#   0 - machine does not have Vivante GPU driver support
#   1 - machine has Vivante GPU driver support
MACHINE_HAS_VIVANTE_KERNEL_DRIVER_SUPPORT        = "0"
MACHINE_HAS_VIVANTE_KERNEL_DRIVER_SUPPORT_imxgpu = "1"

# Graphics libraries
PREFERRED_PROVIDER_virtual/egl      ?= "mesa"
PREFERRED_PROVIDER_virtual/libgl    ?= "mesa"
PREFERRED_PROVIDER_virtual/libgles1 ?= "mesa"
PREFERRED_PROVIDER_virtual/libgles2 ?= "mesa"

PREFERRED_PROVIDER_virtual/egl_imxgpu        ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libgl_imxgpu3d    ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libgles1_imxgpu3d ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libgles2_imxgpu3d ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libg2d            ?= "imx-gpu-g2d"
PREFERRED_PROVIDER_virtual/libg2d_imxdpu     ?= "imx-dpu-g2d"

# Handle default kernel
IMX_DEFAULT_KERNEL = "linux-imx"
IMX_DEFAULT_KERNEL_mxs = "linux-fslc"
IMX_DEFAULT_KERNEL_mx5 = "linux-fslc"
IMX_DEFAULT_KERNEL_mx6 = "linux-fslc-imx"
IMX_DEFAULT_KERNEL_mx7 = "linux-fslc-imx"
IMX_DEFAULT_KERNEL_mx6ul = "linux-fslc-imx"
IMX_DEFAULT_KERNEL_mx6ull = "linux-fslc-imx"
IMX_DEFAULT_KERNEL_mx6ulz = "linux-imx"
IMX_DEFAULT_KERNEL_mx8 = "linux-imx"
IMX_DEFAULT_KERNEL_mx7ulp = "linux-imx"
IMX_DEFAULT_KERNEL_mx6sll = "linux-imx"

PREFERRED_PROVIDER_virtual/kernel ??= "${IMX_DEFAULT_KERNEL}"

SOC_DEFAULT_IMAGE_FSTYPES = "wic.bmap wic.bz2 tar.bz2"
SOC_DEFAULT_IMAGE_FSTYPES_mxs = "uboot-mxsboot-sdcard wic.gz"

# Do not update fstab file when using wic images
WIC_CREATE_EXTRA_ARGS ?= "--no-fstab-update"

IMAGE_FSTYPES ?= "${SOC_DEFAULT_IMAGE_FSTYPES}"

IMAGE_BOOT_FILES_OPTEE     = "tee.bin uTee-${OPTEE_BIN_EXT}"
IMAGE_BOOT_FILES_OPTEE_mx8 = "tee.bin"
IMAGE_BOOT_FILES ?= " \
    ${KERNEL_IMAGETYPE} \
    ${@make_dtb_boot_files(d)} \
    ${@bb.utils.contains('COMBINED_FEATURES', 'optee', '${IMAGE_BOOT_FILES_OPTEE}', '', d)} \
    ${@bb.utils.contains('COMBINED_FEATURES', 'xen', 'xen', '', d)} \
"

IMAGE_INSTALL_append = " \
    ${@bb.utils.contains('COMBINED_FEATURES', 'jailhouse', 'jailhouse', '', d)} \
    ${@bb.utils.contains('COMBINED_FEATURES', 'optee', 'packagegroup-fsl-optee-imx', '', d)} \
    ${@bb.utils.contains('COMBINED_FEATURES', 'xen', 'imx-xen-base imx-xen-hypervisor', '', d)} \
"

### wic default support
WKS_FILE_DEPENDS_MX8     = ""
WKS_FILE_DEPENDS_MX8_mx8 = "imx-boot"
WKS_FILE_DEPENDS ?= " \
    virtual/bootloader \
    e2fsprogs-native \
    bmap-tools-native \
    ${WKS_FILE_DEPENDS_MX8} \
"

SOC_DEFAULT_WKS_FILE ?= "imx-uboot-bootpart.wks.in"
SOC_DEFAULT_WKS_FILE_mx8 ?= "imx-imx-boot-bootpart2.wks.in"
SOC_DEFAULT_WKS_FILE_mxs ?= "imx-uboot-mxs-bootpart.wks.in"

WKS_FILE ?= "${SOC_DEFAULT_WKS_FILE}"

SERIAL_CONSOLES = "115200;ttymxc0"
SERIAL_CONSOLE_mxs = "115200 ttyAMA0"

KERNEL_IMAGETYPE = "zImage"
KERNEL_IMAGETYPE_aarch64 = "Image"

MACHINE_FEATURES = "usbgadget usbhost vfat alsa touchscreen"

MACHINE_FEATURES_append_mx8qm  = " xen"
MACHINE_FEATURES_append_mx8qxp = " xen"

MACHINE_FEATURES_append_imx8mqevk = " jailhouse"
MACHINE_FEATURES_append_imx8mmevk = " jailhouse"

# Add the ability to specify _imx machines
MACHINEOVERRIDES =. "imx:"
