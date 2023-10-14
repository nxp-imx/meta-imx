# This file is included from meta-freescale/conf/machine/include/imx-base.inc
# and provides a simple mechanism to override settings in the file

# Update i.MX 8ULP
IMX_EXTRA_FIRMWARE:mx8ulp-generic-bsp = "firmware-upower firmware-ele-imx"

# Update i.MX 93
IMX_SOC_REV:mx93-generic-bsp  ?= "A1"
IMX_EXTRA_FIRMWARE:mx93-generic-bsp = "imx-boot-firmware-files firmware-ele-imx"

# Add new machine i.MX 8M Plus UltraLite
MACHINEOVERRIDES_EXTENDER:mx8mpul:use-nxp-bsp = "imx-generic-bsp:imx-nxp-bsp:imxfbdev:mx8-generic-bsp:mx8-nxp-bsp:mx8m-generic-bsp:mx8m-nxp-bsp:mx8mpul-generic-bsp:mx8mpul-nxp-bsp"
MACHINEOVERRIDES_EXTENDER:mx8mpul:use-mainline-bsp = "imx-generic-bsp:imx-mainline-bsp:mx8-generic-bsp:mx8-mainline-bsp:mx8m-generic-bsp:mx8m-mainline-bsp:mx8mpul-generic-bsp:mx8mpul-mainline-bsp"
MACHINEOVERRIDES_EXTENDER_FILTER_OUT += "mx8mpul"
MACHINE_SOCARCH_SUFFIX:mx8mpul-nxp-bsp = "-mx8mpul"

# Add new machine i.MX 91 Phantom
IMX_SOC_REV:mx91p-generic-bsp ?= "A1"
SECO_FIRMWARE_NAME:mx91p-generic-bsp ?= "mx93${IMX_SOC_REV_LOWER}-ahab-container.img"
MACHINEOVERRIDES_EXTENDER:mx91p:use-nxp-bsp  = "imx-generic-bsp:imx-nxp-bsp:imxdrm:mx9-generic-bsp:mx9-nxp-bsp:mx91p-generic-bsp:mx91p-nxp-bsp"
MACHINEOVERRIDES_EXTENDER:mx91p:use-mainline-bsp  = "imx-generic-bsp:imx-mainline-bsp:mx9-generic-bsp:mx9-mainline-bsp:mx91p-generic-bsp:mx91p-mainline-bsp"
MACHINEOVERRIDES_EXTENDER_FILTER_OUT += "mx91p"
MACHINE_SOCARCH_SUFFIX:mx91p-nxp-bsp = "-mx91"
IMX_EXTRA_FIRMWARE:mx91p-nxp-bsp = "imx-boot-firmware-files firmware-ele-imx"

# i.MX 6 & 7 stay on weston 10.0 for fbdev
PREFERRED_VERSION_weston:mx6-nxp-bsp ??= "10.0.5.imx"
PREFERRED_VERSION_weston:mx7-nxp-bsp ??= "10.0.5.imx"
PREFERRED_VERSION_weston:imx-nxp-bsp ??= "11.0.3.imx"

PREFERRED_VERSION_wayland-protocols:mx6-nxp-bsp ??= "1.32.imx"
PREFERRED_VERSION_wayland-protocols:mx7-nxp-bsp ??= "1.32.imx"
PREFERRED_VERSION_wayland-protocols:mx8-nxp-bsp ??= "1.32.imx"
PREFERRED_VERSION_wayland-protocols:mx9-nxp-bsp ??= "1.32.imx"

PREFERRED_VERSION_vulkan-headers:imxvulkan           ??= "1.3.239.0"
PREFERRED_VERSION_vulkan-loader:imxvulkan            ??= "1.3.239.0"
PREFERRED_VERSION_vulkan-tools:imxvulkan             ??= "1.3.239.0"
PREFERRED_VERSION_vulkan-validation-layers:imxvulkan ??= "1.3.239.0"

PREFERRED_VERSION_ffmpeg ??= "4.4.1"

PREFERRED_VERSION_libdrm:mx6-nxp-bsp ??= "2.4.115.imx"
PREFERRED_VERSION_libdrm:mx7-nxp-bsp ??= "2.4.115.imx"
PREFERRED_VERSION_libdrm:mx8-nxp-bsp ??= "2.4.115.imx"
PREFERRED_VERSION_libdrm:mx9-nxp-bsp ??= "2.4.115.imx"

PREFERRED_VERSION_optee-client:mx6-nxp-bsp ??= "4.0.0.imx"
PREFERRED_VERSION_optee-client:mx7-nxp-bsp ??= "4.0.0.imx"
PREFERRED_VERSION_optee-client:mx8-nxp-bsp ??= "4.0.0.imx"
PREFERRED_VERSION_optee-client:mx9-nxp-bsp ??= "4.0.0.imx"
PREFERRED_VERSION_optee-os:mx6-nxp-bsp     ??= "4.0.0.imx"
PREFERRED_VERSION_optee-os:mx7-nxp-bsp     ??= "4.0.0.imx"
PREFERRED_VERSION_optee-os:mx8-nxp-bsp     ??= "4.0.0.imx"
PREFERRED_VERSION_optee-os:mx9-nxp-bsp     ??= "4.0.0.imx"
PREFERRED_VERSION_optee-test:mx6-nxp-bsp   ??= "4.0.0.imx"
PREFERRED_VERSION_optee-test:mx7-nxp-bsp   ??= "4.0.0.imx"
PREFERRED_VERSION_optee-test:mx8-nxp-bsp   ??= "4.0.0.imx"
PREFERRED_VERSION_optee-test:mx9-nxp-bsp   ??= "4.0.0.imx"
PREFERRED_VERSION_optee-os-tadevkit:mx6-nxp-bsp   ??= "4.0.0.imx"
PREFERRED_VERSION_optee-os-tadevkit:mx7-nxp-bsp   ??= "4.0.0.imx"
PREFERRED_VERSION_optee-os-tadevkit:mx8-nxp-bsp   ??= "4.0.0.imx"
PREFERRED_VERSION_optee-os-tadevkit:mx9-nxp-bsp   ??= "4.0.0.imx"

PREFERRED_VERSION_opencv:mx8-nxp-bsp ??= "4.7.0.imx"
PREFERRED_VERSION_opencv:mx9-nxp-bsp ??= "4.7.0.imx"

SOC_DEFAULT_IMAGE_FSTYPES = "wic.bmap wic.zst tar.zst"
ZSTD_COMPRESSION_LEVEL ?= "-10"
