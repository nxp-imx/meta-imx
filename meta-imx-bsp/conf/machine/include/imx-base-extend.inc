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

MACHINEOVERRIDES_EXTENDER_FILTER_OUT += "mx8mpul mx93w mx952"

# Add new Soc i.MX 93W
MACHINEOVERRIDES_EXTENDER:mx93w:use-nxp-bsp  = "mx93w-generic-bsp:mx93w-nxp-bsp"

# Add new Soc i.MX 952
MACHINEOVERRIDES_EXTENDER:mx952:use-nxp-bsp  = "imx-generic-bsp:imx-nxp-bsp:imxdrm:imxdpu:imxgpu:imxmali:imxgpu2d:imxgpu3d:mx9-generic-bsp:mx9-nxp-bsp:mx95-generic-bsp:mx95-nxp-bsp:mx952-generic-bsp:mx952-nxp-bsp"
MACHINE_SOCARCH_SUFFIX:mx952-nxp-bsp = "-mx952"
SECO_FIRMWARE_NAME:mx952-generic-bsp ?= "mx952${IMX_SOC_REV_LOWER}-ahab-container.img"
IMX_SOC_REV:mx952-generic-bsp   ??= "A0"
IMX_EXTRA_FIRMWARE:mx952-nxp-bsp = "imx-boot-firmware-files firmware-ele-imx virtual/imx-system-manager virtual/imx-oei"
PREFERRED_VERSION_imx-m7-demos:mx952-nxp-bsp = "25.12.00"

# Add new SoC i.MX 943
IMX_SOC_REV:mx943-generic-bsp ?= "A1"
MACHINEOVERRIDES_EXTENDER:mx943:use-nxp-bsp  = "imx-generic-bsp:imx-nxp-bsp:imxdrm:imxpxp:mx9-generic-bsp:mx9-nxp-bsp:mx94-generic-bsp:mx94-nxp-bsp:mx943-generic-bsp:mx943-nxp-bsp"
MACHINE_SOCARCH_SUFFIX:mx943-nxp-bsp = "-mx943"
IMX_EXTRA_FIRMWARE:mx943-nxp-bsp = "imx-boot-firmware-files firmware-ele-imx virtual/imx-system-manager virtual/imx-oei"
SECO_FIRMWARE_NAME:mx943-nxp-bsp ?= "mx943a1-ahab-container.img mx943a0-ahab-container.img"
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
SYSTEM_MANAGER_FIRMWARE_BASENAME:mx952-nxp-bsp ?= "m33_image"

# Add new machine i.MX 8M Plus UltraLite
MACHINEOVERRIDES_EXTENDER:mx8mpul:use-nxp-bsp = "imx-generic-bsp:imx-nxp-bsp:imxfbdev:mx8-generic-bsp:mx8-nxp-bsp:mx8m-generic-bsp:mx8m-nxp-bsp:mx8mpul-generic-bsp:mx8mpul-nxp-bsp"
MACHINEOVERRIDES_EXTENDER:mx8mpul:use-mainline-bsp = "imx-generic-bsp:imx-mainline-bsp:mx8-generic-bsp:mx8-mainline-bsp:mx8m-generic-bsp:mx8m-mainline-bsp:mx8mpul-generic-bsp:mx8mpul-mainline-bsp"
MACHINE_SOCARCH_SUFFIX:mx8mpul-nxp-bsp = "-mx8mpul"

# ELE extra/runtime firmware, to be installed and accessed from userspace.
# Note that multiple names can be given in order to install multiple versions
# to a single rootfs.
SECOEXT_FIRMWARE_NAME                     = ""
SECOEXT_FIRMWARE_NAME:mx8ulp-generic-bsp ?= "mx8ulp${IMX_SOC_REV_LOWER}ext-ahab-container.img"
SECOEXT_FIRMWARE_NAME:mx95-generic-bsp   ?= "mx95a0runtime-ahab-container.img mx95b0runtime-ahab-container.img"
SECOEXT_FIRMWARE_NAME:mx952-generic-bsp  ?= "mx952${IMX_SOC_REV_LOWER}runtime-ahab-container.img"
SECOEXT_FIRMWARE_NAME:mx943-nxp-bsp  ?= "mx943a0runtime-ahab-container.img mx943a1runtime-ahab-container.img"

# Set preferred OpenCL ICD runtime
PREFERRED_RPROVIDER_virtual-opencl-icd         ?= "libopencl-mesa"
PREFERRED_RPROVIDER_virtual-opencl-icd:imxviv  ?= "libopencl-imx"
PREFERRED_RPROVIDER_virtual-opencl-icd:imxmali ?= "mali-imx-opencl-icd"

# GStreamer forked recipes
PREFERRED_VERSION_gstreamer1.0:imx-nxp-bsp              ??= "1.28.1.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-bad:imx-nxp-bsp  ??= "1.28.1.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-base:imx-nxp-bsp ??= "1.28.1.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-good:imx-nxp-bsp ??= "1.28.1.imx"

# GStreamer backport recipes
PREFERRED_VERSION_gstreamer1.0-libav:imx-nxp-bsp        ??= "1.28.1"
PREFERRED_VERSION_gst-devtools:imx-nxp-bsp              ??= "1.28.1"
PREFERRED_VERSION_gst-examples:imx-nxp-bsp               ??= "1.28.1"
PREFERRED_VERSION_gstreamer1.0-plugins-ugly:imx-nxp-bsp ??= "1.28.1"
PREFERRED_VERSION_gstreamer1.0-python:imx-nxp-bsp       ??= "1.28.1"
PREFERRED_VERSION_gstreamer1.0-rtsp-server:imx-nxp-bsp  ??= "1.28.1"

# libcamera fork for certain SOCs
PREFERRED_VERSION_libcamera ??= "${PREFERRED_VERSION_LIBCAMERA_IMX}"
PREFERRED_VERSION_LIBCAMERA_IMX                = ""
PREFERRED_VERSION_LIBCAMERA_IMX:mx95-nxp-bsp   = "0.7.1.imx"
PREFERRED_VERSION_LIBCAMERA_IMX:mx8mm-nxp-bsp  = "0.7.1.imx"
PREFERRED_VERSION_LIBCAMERA_IMX:mx8ulp-nxp-bsp = "0.7.1.imx"
PREFERRED_VERSION_LIBCAMERA_IMX:mx8mq-nxp-bsp  = "0.7.1.imx"

PREFERRED_VERSION_weston:imx-nxp-bsp ??= "15.0.1.imx"
# i.MX 6 & 7 stay on weston 10.0 for fbdev
PREFERRED_VERSION_weston:mx6-nxp-bsp ??= "10.0.5.imx"
PREFERRED_VERSION_weston:mx7-nxp-bsp ??= "10.0.5.imx"

PREFERRED_VERSION_wayland-protocols:imx-nxp-bsp ??= ""

PREFERRED_VERSION_libdrm:imx-nxp-bsp ??= "2.4.127.imx"

PREFERRED_VERSION_gfxreconstruct:imxvulkan             ??= "1.3.275.0"

PREFERRED_VERSION_optee-os:imx-nxp-bsp     ??= "4.10.0.imx"
PREFERRED_VERSION_optee-client:imx-nxp-bsp ??= "4.10.0.imx"
PREFERRED_VERSION_optee-test:imx-nxp-bsp   ??= "4.10.0.imx"
PREFERRED_VERSION_optee-os-tadevkit:imx-nxp-bsp   ??= "4.10.0.imx"

PREFERRED_VERSION_opencv:mx8-nxp-bsp ??= "4.13.0.imx"
PREFERRED_VERSION_opencv:mx9-nxp-bsp ??= "4.13.0.imx"

PREFERRED_VERSION_xen-tools = "4.21.imx+stable"
PREFERRED_VERSION_xen       = "4.21.imx+stable"

QEMUVERSION                      ??= "10.2.0"
QEMUVERSION:mx95-nxp-bsp         ??= "10.2.5.imx"
PREFERRED_VERSION_qemu           ??= "${QEMUVERSION}"
PREFERRED_VERSION_qemu-native    ??= "${QEMUVERSION}"
PREFERRED_VERSION_nativesdk-qemu ??= "${QEMUVERSION}"

SOC_DEFAULT_IMAGE_FSTYPES = "wic.bmap wic.zst tar.zst"
ZSTD_COMPRESSION_LEVEL ?= "10"

# ============================================================================
# i.MX Mali GPU Driver Configuration
# ============================================================================
# Driver selection (mali-imx or mesa) for all APIs (GLES, Vulkan, OpenCL)
IMX_MALI_DRIVERS ??= "mali-imx"

# Default driver selection in dual-driver mode (mali-imx or mesa)
IMX_MALI_DEFAULT_DRIVER ??= "mali-imx"

# Detect dual-driver mode
IMX_MALI_DUAL_DRIVER = "0"
IMX_MALI_DUAL_DRIVER:imxmali = "${@'1' if 'mali-imx' in (d.getVar('IMX_MALI_DRIVERS') or '') and 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else '0'}"

# ============================================================================
# Graphics Provider Configuration
# ============================================================================
# Build-time providers - ALL must point to the same recipe to avoid skipping

# Desktop GL provider (mali-imx doesn't provide desktop GL)
PREFERRED_PROVIDER_virtual/libgl:imxgpu3d:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mesa-gl'}"
PREFERRED_PROVIDER_virtual/libgl:imxgpu:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mesa-gl'}"
PREFERRED_PROVIDER_virtual/mesa:imxgpu3d:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mesa-gl'}"
PREFERRED_PROVIDER_virtual/mesa:imxgpu:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mesa-gl'}"

# EGL/GLES/GBM providers - ALL point to mesa when mesa is in driver list
PREFERRED_PROVIDER_virtual/egl:imxgpu3d:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mali-imx'}"
PREFERRED_PROVIDER_virtual/libegl:imxgpu3d:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mali-imx'}"
PREFERRED_PROVIDER_virtual/libgles1:imxgpu3d:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mali-imx'}"
PREFERRED_PROVIDER_virtual/gles1:imxgpu3d:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mali-imx'}"
PREFERRED_PROVIDER_virtual/libgles2:imxgpu3d:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mali-imx'}"
PREFERRED_PROVIDER_virtual/gles2:imxgpu3d:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mali-imx'}"
PREFERRED_PROVIDER_virtual/libgles3:imxgpu3d:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mali-imx'}"
PREFERRED_PROVIDER_virtual/gles3:imxgpu3d:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mali-imx'}"
PREFERRED_PROVIDER_virtual/libgbm:imxgpu3d:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mali-imx'}"
PREFERRED_PROVIDER_virtual/gbm:imxgpu3d:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mali-imx'}"

# Vulkan provider
PREFERRED_PROVIDER_virtual/vulkan-icd:imxgpu3d:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mali-imx'}"
PREFERRED_PROVIDER_virtual/vulkan:imxgpu3d:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mali-imx'}"

# OpenCL provider
PREFERRED_PROVIDER_virtual/opencl-icd:imxgpu3d:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mali-imx'}"
PREFERRED_PROVIDER_virtual/opencl:imxgpu3d:imxmali = "${@'mesa' if 'mesa' in (d.getVar('IMX_MALI_DRIVERS') or '') else 'mali-imx'}"

# Runtime providers - Mesa is preferred in dual-driver mode
PREFERRED_RPROVIDER_virtual-vulkan-icd:imxmali = "${@'mesa-vulkan-drivers' if d.getVar('IMX_MALI_DUAL_DRIVER') == '1' else ''}"
PREFERRED_RPROVIDER_virtual-opencl-icd:imxmali = "${@'libopencl-mesa' if d.getVar('IMX_MALI_DUAL_DRIVER') == '1' else ''}"

MACHINE_EXTRA_RDEPENDS:append:imxmali = " linux-firmware-mali-csffw-arch1012"

BBMASK += "meta-freescale/recipes-graphics/mesa/mesa-gl.bbappend"

PREFERRED_VERSION_mesa         = "26.0.5"
PREFERRED_VERSION_mesa:imxmali = "26.0.5.imx"
