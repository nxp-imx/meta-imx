# Provides the i.MX common settings

include conf/machine/include/fsl-default-settings.inc
include conf/machine/include/fsl-default-versions.inc

# Set specific make target and binary suffix
PREFERRED_PROVIDER_u-boot ??= "u-boot-fslc"
PREFERRED_PROVIDER_virtual/bootloader ??= "u-boot-fslc"

PREFERRED_PROVIDER_u-boot-mxsboot-native ??= "u-boot-fslc-mxsboot-native"

UBOOT_MAKE_TARGET ?= "u-boot.imx"
UBOOT_MAKE_TARGET_mxs ?= "u-boot.sb"

UBOOT_SUFFIX ?= "imx"
UBOOT_SUFFIX_mxs ?= "sb"

UBOOT_ENTRYPOINT_mxs = "0x40008000"
UBOOT_ENTRYPOINT_mx51  = "0x90008000"
UBOOT_ENTRYPOINT_mx53  = "0x70008000"
UBOOT_ENTRYPOINT_mx6  = "0x10008000"
UBOOT_ENTRYPOINT_mx6sl = "0x80008000"
UBOOT_ENTRYPOINT_mx6sx = "0x80008000"
UBOOT_ENTRYPOINT_mx6ul  = "0x10008000"
UBOOT_ENTRYPOINT_mx6ull  = "0x10008000"
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
DEFAULTTUNE_mx7 ?= "cortexa7thf-neon"
DEFAULTTUNE_mx8 ?= "aarch64"
DEFAULTTUNE_vf ?= "cortexa5thf-neon"

INHERIT += "machine-overrides-extender"

MACHINEOVERRIDES_EXTENDER_mx6q   = "imxfbdev:imxipu:imxvpu:imxvpucnm:imxgpu:imxgpu2d:imxdpublit:imxgpu3d"
MACHINEOVERRIDES_EXTENDER_mx6dl  = "imxfbdev:imxipu:imxpxp:imxvpu:imxvpucnm:imxgpu:imxgpu2d:imxdpublit:imxgpu3d:imxepdc"
MACHINEOVERRIDES_EXTENDER_mx6sx  = "imxfbdev:imxpxp:imxgpu:imxgpu2d:imxdpublit:imxgpu3d"
MACHINEOVERRIDES_EXTENDER_mx6sl  = "imxfbdev:imxpxp:imxgpu:imxgpu2d:imxdpublit:imxepdc"
MACHINEOVERRIDES_EXTENDER_mx6sll = "imxfbdev:imxpxp:imxepdc"
MACHINEOVERRIDES_EXTENDER_mx6ul  = "imxfbdev:imxpxp"
MACHINEOVERRIDES_EXTENDER_mx6ull = "imxfbdev:imxpxp:imxepdc"
MACHINEOVERRIDES_EXTENDER_mx7d   = "imxfbdev:imxpxp:imxepdc"
MACHINEOVERRIDES_EXTENDER_mx7ulp = "imxfbdev:imxpxp:imxgpu:imxgpu2d:imxdpublit:imxgpu3d"
MACHINEOVERRIDES_EXTENDER_mx8mq  = "imxdrm:imxdcss:imxvpu:imxvpuhantro:imxgpu:imxgpu3d"
MACHINEOVERRIDES_EXTENDER_mx8qm  = "imxdrm:imxdpu:imxgpu:imxgpu2d:imxgpu3d:imxopenvx"
MACHINEOVERRIDES_EXTENDER_mx8qxp = "imxdrm:imxdpu:imxgpu:imxgpu2d:imxgpu3d"


# Sub-architecture support
MACHINE_SOCARCH_SUFFIX ?= ""
MACHINE_SOCARCH_SUFFIX_mx6q = "-mx6qdl"
MACHINE_SOCARCH_SUFFIX_mx6dl = "-mx6qdl"
MACHINE_SOCARCH_SUFFIX_mx6sx = "-mx6sx"
MACHINE_SOCARCH_SUFFIX_mx6sl = "-mx6sl"
MACHINE_SOCARCH_SUFFIX_mx7d = "-mx7d"
MACHINE_SOCARCH_SUFFIX_vf60 = "-vf60"
MACHINE_SOCARCH_SUFFIX_vf50 = "-vf50"
MACHINE_SOCARCH_SUFFIX_mx6ul  = "-mx6ul"
MACHINE_SOCARCH_SUFFIX_mx6ull = "-mx6ul"
MACHINE_SOCARCH_SUFFIX_mx8mq  = "-mx8mq"
MACHINE_SOCARCH_SUFFIX_mx8qm  = "-mx8qm"
MACHINE_SOCARCH_SUFFIX_mx8qxp = "-mx8qxp"

MACHINE_ARCH_FILTER = "virtual/kernel"
MACHINE_SOCARCH_FILTER_append_imxvpu = " \
    imx-codec \
    imx-parser \
    imx-vpu \
    imx-vpuwrap \
    libimxvpuapi \
"
MACHINE_SOCARCH_FILTER_append_imxgpu = " \
    virtual/egl \
    virtual/mesa \
    virtual/libg2d \
    virtual/libgal-x11 \
    virtual/libopenvg \
    virtual/wayland-egl \
    cairo \
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
    imx-parser \
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
MACHINE_FIRMWARE_append = " firmware-imx-brcm"
MACHINE_FIRMWARE_append_mx7 = " firmware-imx-epdc"
MACHINE_FIRMWARE_append_mx6q = " firmware-imx-vpu-imx6q"
MACHINE_FIRMWARE_append_mx6dl = " firmware-imx-vpu-imx6d firmware-imx-epdc"
MACHINE_FIRMWARE_append_mx6sl = " firmware-imx-epdc"
MACHINE_FIRMWARE_append_mx6ull = " firmware-imx-epdc"
MACHINE_FIRMWARE_append_mx53 = " firmware-imx-vpu-imx53 firmware-imx-sdma-imx53"
MACHINE_FIRMWARE_append_mx51 = " firmware-imx-vpu-imx51 firmware-imx-sdma-imx51"
MACHINE_FIRMWARE_append_mx8  = " linux-firmware-ath10k linux-firmware-qca"

# FIXME: Needs addition of firmware-imx of official BSPs
#MACHINE_FIRMWARE_append_mx27 = " firmware-imx-vpu-imx27"
#MACHINE_FIRMWARE_append_mx25 = " firmware-imx-sdma-imx25"

MACHINE_EXTRA_RRECOMMENDS += "${MACHINE_FIRMWARE}"

# Extra audio support
# FIXME: Add support for ALL SoC families
MACHINE_EXTRA_RRECOMMENDS_append_mx6dl = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"
MACHINE_EXTRA_RRECOMMENDS_append_mx6q = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"
MACHINE_EXTRA_RRECOMMENDS_append_mx6sl = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"
MACHINE_EXTRA_RRECOMMENDS_append_mx6sx = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"
MACHINE_EXTRA_RRECOMMENDS_append_mx6ul = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"
MACHINE_EXTRA_RRECOMMENDS_append_mx6ull = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"
MACHINE_EXTRA_RRECOMMENDS_append_mx7d = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"

# Extra udev rules
MACHINE_EXTRA_RRECOMMENDS += "udev-rules-imx"

# GStreamer 1.0 plugins
MACHINE_GSTREAMER_1_0_PLUGIN ?= ""
MACHINE_GSTREAMER_1_0_PLUGIN_mx6dl ?= "gstreamer1.0-plugins-imx-meta"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6q ?= "gstreamer1.0-plugins-imx-meta"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sl ?= "gstreamer1.0-plugins-imx-meta"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sx ?= "gstreamer1.0-plugins-imx-meta"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6ul ?= "gstreamer1.0-plugins-imx-meta"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6ull ?= "gstreamer1.0-plugins-imx-meta"
MACHINE_GSTREAMER_1_0_PLUGIN_mx7d ?= "gstreamer1.0-plugins-imx-meta"

# Handle Vivante kernel driver setting:
#   0 - machine does not have Vivante GPU driver support
#   1 - machine has Vivante GPU driver support
MACHINE_HAS_VIVANTE_KERNEL_DRIVER_SUPPORT        = "0"
MACHINE_HAS_VIVANTE_KERNEL_DRIVER_SUPPORT_imxgpu = "1"


# mx6 GPU libraries
PREFERRED_PROVIDER_virtual/egl_mx6q ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/egl_mx6dl ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/egl_mx6sx ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/egl_mx6sl ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/egl_mx6ul ?= "mesa"
PREFERRED_PROVIDER_virtual/egl_mx6ull ?= "mesa"
PREFERRED_PROVIDER_virtual/egl_mx8 ?= "imx-gpu-viv"

PREFERRED_PROVIDER_virtual/libgles1_mx6q ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libgles1_mx6dl ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libgles1_mx6sx ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libgles1_mx6sl ?= "mesa"
PREFERRED_PROVIDER_virtual/libgles1_mx6ul ?= "mesa"
PREFERRED_PROVIDER_virtual/libgles1_mx6ull ?= "mesa"
PREFERRED_PROVIDER_virtual/libgles1_mx8 ?= "imx-gpu-viv"

PREFERRED_PROVIDER_virtual/libgles2_mx6q ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libgles2_mx6dl ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libgles2_mx6sx ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libgles2_mx6sl ?= "mesa"
PREFERRED_PROVIDER_virtual/libgles2_mx6ul ?= "mesa"
PREFERRED_PROVIDER_virtual/libgles2_mx6ull ?= "mesa"
PREFERRED_PROVIDER_virtual/libgles2_mx8 ?= "imx-gpu-viv"

PREFERRED_PROVIDER_virtual/libgl_mx6q ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libgl_mx6dl ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libgl_mx6sx ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libgl_mx6sl ?= "mesa"
PREFERRED_PROVIDER_virtual/libgl_mx6ul ?= "mesa"
PREFERRED_PROVIDER_virtual/libgl_mx6ull ?= "mesa"
PREFERRED_PROVIDER_virtual/libgl_mx8 ?= "imx-gpu-viv"

PREFERRED_PROVIDER_virtual/libg2d_mx6 ?= "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libg2d_mx6ul = ""
PREFERRED_PROVIDER_virtual/libg2d_mx6ull = ""
PREFERRED_PROVIDER_virtual/libg2d_mx8 = "imx-dpu-g2d"

# Handle default kernel
IMX_DEFAULT_KERNEL = "linux-imx"
IMX_DEFAULT_KERNEL_mxs = "linux-fslc"
IMX_DEFAULT_KERNEL_mx5 = "linux-fslc"
IMX_DEFAULT_KERNEL_mx6 = "linux-fslc-imx"
IMX_DEFAULT_KERNEL_mx7 = "linux-fslc-imx"
IMX_DEFAULT_KERNEL_mx6ul = "linux-fslc-imx"
IMX_DEFAULT_KERNEL_mx6ull = "linux-fslc-imx"
IMX_DEFAULT_KERNEL_mx8 = "linux-imx"

PREFERRED_PROVIDER_virtual/kernel ??= "${IMX_DEFAULT_KERNEL}"

SOC_DEFAULT_IMAGE_FSTYPES = "sdcard.gz"
SOC_DEFAULT_IMAGE_FSTYPES_mxs = "uboot-mxsboot-sdcard sdcard.gz"

SDCARD_ROOTFS ?= "${IMGDEPLOYDIR}/${IMAGE_NAME}.rootfs.ext4"
IMAGE_FSTYPES ?= "${SOC_DEFAULT_IMAGE_FSTYPES}"

SERIAL_CONSOLE = "115200 ttymxc0"
SERIAL_CONSOLE_mxs = "115200 ttyAMA0"

KERNEL_IMAGETYPE = "zImage"
KERNEL_IMAGETYPE_mx8 = "Image"

MACHINE_FEATURES = "usbgadget usbhost vfat alsa touchscreen"
MACHINE_FEATURES_append_mx8 = " xen"

# Add the ability to specify _imx machines
MACHINEOVERRIDES =. "imx:"

# Add optee capability
MACHINE_FEATURES_append_mx6q	= " optee"
MACHINE_FEATURES_append_mx6qp	= " optee"
MACHINE_FEATURES_append_mx6dl	= " optee"
MACHINE_FEATURES_append_mx6solo = " optee"
MACHINE_FEATURES_append_mx6sl   = " optee"
MACHINE_FEATURES_append_mx6sll  = " optee"
MACHINE_FEATURES_append_mx6sx	= " optee"
MACHINE_FEATURES_append_mx6ul	= " optee"
MACHINE_FEATURES_append_mx6ull	= " optee"
MACHINE_FEATURES_append_mx7d	= " optee"
MACHINE_FEATURES_append_mx7ulp	= " optee"
MACHINE_FEATURES_append_mx8mq	= " optee"

IMX_KERNEL_DEVICETREE_BASE = ""
IMX_KERNEL_DEVICETREE_BASE_imx6qsabreauto = "imx6q-sabreauto"
IMX_KERNEL_DEVICETREE_BASE_imx6qsabresd = "imx6q-sabresd"
IMX_KERNEL_DEVICETREE_BASE_imx6qpsabreauto = "imx6qp-sabreauto"
IMX_KERNEL_DEVICETREE_BASE_imx6qpsabresd = "imx6qp-sabresd"
IMX_KERNEL_DEVICETREE_BASE_imx6dlsabreauto = "imx6dl-sabreauto"
IMX_KERNEL_DEVICETREE_BASE_imx6dlsabresd = "imx6dl-sabresd"
IMX_KERNEL_DEVICETREE_BASE_imx6solosabreauto = "imx6dl-sabreauto"
IMX_KERNEL_DEVICETREE_BASE_imx6solosabresd = "imx6dl-sabresd"
IMX_KERNEL_DEVICETREE_BASE_imx6slevk = "imx6sl-evk"
IMX_KERNEL_DEVICETREE_BASE_imx6sxsabreauto = "imx6sx-sabreauto"
IMX_KERNEL_DEVICETREE_BASE_imx6sxsabresd = "imx6sx-sdb"
IMX_KERNEL_DEVICETREE_BASE_imx6sllevk = "imx6sll-evk"
IMX_KERNEL_DEVICETREE_BASE_imx6ulevk = "imx6ul-14x14-evk"
IMX_KERNEL_DEVICETREE_BASE_imx6ull14x14evk = "imx6ull-14x14-evk"
IMX_KERNEL_DEVICETREE_BASE_imx7dsabresd = "imx7d-sdb"
IMX_KERNEL_DEVICETREE_BASE_imx7ulpevk = "imx7ulp-evk"
IMX_KERNEL_DEVICETREE_BASE_imx8mqevk = "imx8mq-evk"

IMX_UBOOT_CONFIG_BASE = ""
IMX_UBOOT_CONFIG_BASE_imx6qsabreauto = "mx6qsabreauto"
IMX_UBOOT_CONFIG_BASE_imx6qsabresd = "mx6qsabresd"
IMX_UBOOT_CONFIG_BASE_imx6qpsabreauto = "mx6qpsabreauto"
IMX_UBOOT_CONFIG_BASE_imx6qpsabresd = "mx6qpsabresd"
IMX_UBOOT_CONFIG_BASE_imx6dlsabreauto = "mx6dlsabreauto"
IMX_UBOOT_CONFIG_BASE_imx6dlsabresd = "mx6dlsabresd"
IMX_UBOOT_CONFIG_BASE_imx6solosabreauto = "mx6solosabreauto"
IMX_UBOOT_CONFIG_BASE_imx6solosabresd = "mx6solosabresd"
IMX_UBOOT_CONFIG_BASE_imx6slevk = "mx6slevk"
IMX_UBOOT_CONFIG_BASE_imx6sllevk = "mx6sllevk"
IMX_UBOOT_CONFIG_BASE_imx6sxsabresd = "mx6sxsabresd"
IMX_UBOOT_CONFIG_BASE_imx6sxsabreauto = "mx6sxsabreauto"
IMX_UBOOT_CONFIG_BASE_imx6ulevk = "mx6ul_14x14_evk"
IMX_UBOOT_CONFIG_BASE_imx6ull14x14evk = "mx6ull_14x14_evk"
IMX_UBOOT_CONFIG_BASE_imx7dsabresd = "mx7dsabresd"
IMX_UBOOT_CONFIG_BASE_imx7ulpevk = "mx7ulp_evk"
IMX_UBOOT_CONFIG_BASE_imx8mqevk = "mx8mq_evk"

OPTEE_BIN_EXT = ""
OPTEE_BIN_EXT_imx6qsabreauto = "6qauto"
OPTEE_BIN_EXT_imx6qsabresd = "6qsdb"
OPTEE_BIN_EXT_imx6qpsabreauto = "6qpauto"
OPTEE_BIN_EXT_imx6qpsabresd = "6qpsdb"
OPTEE_BIN_EXT_imx6dlsabreauto = "6dlauto"
OPTEE_BIN_EXT_imx6dlsabresd = "6dlsdb"
OPTEE_BIN_EXT_imx6solosabresd = "6solosdb"
OPTEE_BIN_EXT_imx6soloauto = "6soloauto"
OPTEE_BIN_EXT_imx6slevk = "6slevk"
OPTEE_BIN_EXT_imx6sllevk = "6sllevk"
OPTEE_BIN_EXT_imx6sxsabreauto = "6sxauto"
OPTEE_BIN_EXT_imx6sxsabresd = "6sxsdb"
OPTEE_BIN_EXT_imx6ulevk = "6ulevk"
OPTEE_BIN_EXT_imx6ull14x14evk = "6ullevk"
OPTEE_BIN_EXT_imx7dsabresd = "7dsdb"
OPTEE_BIN_EXT_imx7ulpevk = "7ulp"
OPTEE_BIN_EXT_imx8mqevk = "8mq"
