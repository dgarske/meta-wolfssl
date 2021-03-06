SUMMARY = "wolfTPM Portable TPM 2.0 Library"
DESCRIPTION = "wolfTPM is a portable TPM 2.0 project, designed for embedded \
               use. It is highly portable, due to having been written in \
               native C, having a single IO callback for hardware interface, \
               no external dependencies, and its compact code with low \
               resource use."
HOMEPAGE = "https://www.wolfssl.com/products/wolftpm"
BUGTRACKER = "https://github.com/wolfssl/wolftpm/issues"
SECTION = "libs"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "wolfssl"

SRC_URI[md5sum] = "18796ad239392b5f485c3301171fdb4a"
SRC_URI[sha256sum] = "14f6d0f93d5d2192f768782c66fbb54ad9c6766d3266707e484fff3431b7faf4"
SRC_URI = "https://www.wolfssl.com/wolftpm-${PV}.zip \
           file://0001-fix-have-wolfssl-m4-rule.patch"

inherit autotools
