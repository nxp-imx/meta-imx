# This file is included from meta-freescale/conf/machine/include/imx-base.inc
# and provides a simple mechanism to override settings in the file

IMX_DEFAULT_BSP = "nxp"

# The default bootloader and kernel set in meta-freescale is for fslc
IMX_DEFAULT_BOOTLOADER:imx-nxp-bsp = "u-boot-imx"
IMX_DEFAULT_KERNEL:imx-nxp-bsp     = "linux-imx"

# IMXBOOT_VARIANT infrastructure
IMXBOOT_VARIANT  ?= ""
IMXBOOT_VARIANTS ?= "NONE"
BOOT_VARIANT = "${@bb.utils.contains_any('IMXBOOT_VARIANT', '${IMXBOOT_VARIANTS}', '-variant-${IMXBOOT_VARIANT}', '', d)}"

# Add new SoC i.MX 943
MACHINEOVERRIDES_EXTENDER:mx943:use-nxp-bsp  = "imx-generic-bsp:imx-nxp-bsp:imxdrm:imxpxp:mx9-generic-bsp:mx9-nxp-bsp:mx94-generic-bsp:mx94-nxp-bsp:mx943-generic-bsp:mx943-nxp-bsp"
MACHINE_SOCARCH_SUFFIX:mx943-nxp-bsp = "-mx943"
IMX_EXTRA_FIRMWARE:mx943-nxp-bsp = "imx-boot-firmware-files firmware-ele-imx virtual/imx-system-manager virtual/imx-oei"
SECO_FIRMWARE_NAME:mx943-generic-bsp ?= "mx943${IMX_SOC_REV_LOWER}-ahab-container.img"
PREFERRED_PROVIDER_virtual/libg2d:mx943-nxp-bsp ?= "imx-pxp-g2d"

# Update i.MX 95
IMX_SOC_REV:mx95-generic-bsp ?= "B0"
IMX_EXTRA_FIRMWARE:mx95-nxp-bsp = "imx-boot-firmware-files firmware-ele-imx virtual/imx-system-manager virtual/imx-oei"
# The System Manager Firmware Name corresponds to a particular binary implementation
# in the Yocto deploy folder. The default name is comprised of the Firmware Basename
# and the default system manager Config name, e.g., m33_image-mx95evk.bin and
# m33_image-mx95evk_fusa.bin for the standard BSP version and FuSa version, respectively
SYSTEM_MANAGER_FIRMWARE_NAME                  ?= "${SYSTEM_MANAGER_FIRMWARE_BASENAME}-${SYSTEM_MANAGER_CONFIG}"
# The System Manager Firmware Basename is an alias used by imx-boot instead of using
# a unique name for each implementation, e.g., m33_image.bin for i.MX 95
SYSTEM_MANAGER_FIRMWARE_BASENAME              ?= "INVALID"
SYSTEM_MANAGER_FIRMWARE_BASENAME:mx95-nxp-bsp ?= "m33_image"

# Add new machine i.MX 8M Plus UltraLite
MACHINEOVERRIDES_EXTENDER:mx8mpul:use-nxp-bsp = "imx-generic-bsp:imx-nxp-bsp:imxfbdev:mx8-generic-bsp:mx8-nxp-bsp:mx8m-generic-bsp:mx8m-nxp-bsp:mx8mpul-generic-bsp:mx8mpul-nxp-bsp"
MACHINEOVERRIDES_EXTENDER:mx8mpul:use-mainline-bsp = "imx-generic-bsp:imx-mainline-bsp:mx8-generic-bsp:mx8-mainline-bsp:mx8m-generic-bsp:mx8m-mainline-bsp:mx8mpul-generic-bsp:mx8mpul-mainline-bsp"
MACHINEOVERRIDES_EXTENDER_FILTER_OUT += "mx8mpul"
MACHINE_SOCARCH_SUFFIX:mx8mpul-nxp-bsp = "-mx8mpul"

# ELE extra/runtime firmware, to be installed and accessed from userspace.
# Note that multiple names can be given in order to install multiple versions
# to a single rootfs.
SECOEXT_FIRMWARE_NAME                     = ""
SECOEXT_FIRMWARE_NAME:mx8ulp-generic-bsp ?= "mx8ulp${IMX_SOC_REV_LOWER}ext-ahab-container.img"
SECOEXT_FIRMWARE_NAME:mx95-generic-bsp   ?= "mx95a0runtime-ahab-container.img mx95b0runtime-ahab-container.img"
SECOEXT_FIRMWARE_NAME:mx943-generic-bsp  ?= "mx943${IMX_SOC_REV_LOWER}runtime-ahab-container.img"

# GStreamer forked recipes
PREFERRED_VERSION_gstreamer1.0:imx-nxp-bsp              ??= "1.26.6.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-bad:imx-nxp-bsp  ??= "1.26.6.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-base:imx-nxp-bsp ??= "1.26.6.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-good:imx-nxp-bsp ??= "1.26.6.imx"

# GStreamer backport recipes
PREFERRED_VERSION_gstreamer1.0-libav:imx-nxp-bsp        ??= "1.26.6"
PREFERRED_VERSION_gst-devtools:imx-nxp-bsp              ??= "1.26.6"
PREFERRED_VERSION_gstreamer1.0-plugins-ugly:imx-nxp-bsp ??= "1.26.6"
PREFERRED_VERSION_gstreamer1.0-python:imx-nxp-bsp       ??= "1.26.6"
PREFERRED_VERSION_gstreamer1.0-rtsp-server:imx-nxp-bsp  ??= "1.26.6"
PREFERRED_VERSION_gstreamer1.0-vaapi:imx-nxp-bsp        ??= "1.26.6"


# Keep ffmpeg version align with OE upstream
PREFERRED_VERSION_ffmpeg:mx8-nxp-bsp ??= "7.%"
PREFERRED_VERSION_ffmpeg:mx9-nxp-bsp ??= "7.%"

PREFERRED_VERSION_weston:imx-nxp-bsp ??= "14.0.2.imx"
# i.MX 6 & 7 stay on weston 10.0 for fbdev
PREFERRED_VERSION_weston:mx6-nxp-bsp ??= "10.0.5.imx"
PREFERRED_VERSION_weston:mx7-nxp-bsp ??= "10.0.5.imx"

PREFERRED_VERSION_wayland-protocols:imx-nxp-bsp ??= "1.41.imx"

PREFERRED_VERSION_xwayland:imx-nxp-bsp ??= ""

PREFERRED_VERSION_libdrm:imx-nxp-bsp ??= "2.4.123.imx"

PREFERRED_VERSION_gfxreconstruct:imxvulkan             ??= "1.3.275.0"
PREFERRED_VERSION_vulkan-samples:imxvulkan             ??= "viv"

PREFERRED_VERSION_vulkan-samples:imx-nxp-bsp           ??= "git"

PREFERRED_VERSION_optee-os:imx-nxp-bsp     ??= "4.8.0.imx"
PREFERRED_VERSION_optee-client:imx-nxp-bsp ??= "4.8.0.imx"
PREFERRED_VERSION_optee-test:imx-nxp-bsp   ??= "4.8.0.imx"
PREFERRED_VERSION_optee-os-tadevkit:imx-nxp-bsp   ??= "4.8.0.imx"

PREFERRED_VERSION_opencv:mx8-nxp-bsp ??= "4.12.0.imx"
PREFERRED_VERSION_opencv:mx9-nxp-bsp ??= "4.12.0.imx"

PREFERRED_VERSION_xen-tools = "4.19.imx+stable"
PREFERRED_VERSION_xen       = "4.19.imx+stable"

QEMUVERSION              = "9.0.2"
QEMUVERSION:mx95-nxp-bsp = "9.0.2.imx"

SOC_DEFAULT_IMAGE_FSTYPES = "wic.bmap wic.zst tar.zst"
ZSTD_COMPRESSION_LEVEL ?= "10"
