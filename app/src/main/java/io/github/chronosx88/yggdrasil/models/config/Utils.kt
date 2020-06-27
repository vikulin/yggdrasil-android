package io.github.chronosx88.yggdrasil.models.config

import com.google.gson.Gson
import io.github.chronosx88.yggdrasil.models.DNSInfo
import io.github.chronosx88.yggdrasil.models.PeerInfo
import java.net.InetAddress
import java.net.InetSocketAddress
import java.net.Socket

class Utils {

    companion object {

        @JvmStatic
        fun deserializeStringList2PeerInfoSet(list: List<String>): MutableSet<PeerInfo> {
            var gson = Gson()
            var out = mutableSetOf<PeerInfo>()
            for(s in list) {
                out.add(gson.fromJson(s, PeerInfo::class.java))
            }
            return out
        }

        @JvmStatic
        fun deserializeStringList2DNSInfoSet(list: List<String>): MutableSet<DNSInfo> {
            var gson = Gson()
            var out = mutableSetOf<DNSInfo>()
            for(s in list) {
                out.add(gson.fromJson(s, DNSInfo::class.java))
            }
            return out
        }

        @JvmStatic
        fun deserializeStringSet2PeerInfoSet(list: Set<String>): MutableSet<PeerInfo> {
            var gson = Gson()
            var out = mutableSetOf<PeerInfo>()
            for(s in list) {
                out.add(gson.fromJson(s, PeerInfo::class.java))
            }
            return out
        }

        @JvmStatic
        fun deserializeStringSet2DNSInfoSet(list: Set<String>): MutableSet<DNSInfo> {
            var gson = Gson()
            var out = mutableSetOf<DNSInfo>()
            for(s in list) {
                out.add(gson.fromJson(s, DNSInfo::class.java))
            }
            return out
        }

        @JvmStatic
        fun serializePeerInfoSet2StringList(list: Set<PeerInfo>): ArrayList<String> {
            var gson = Gson()
            var out = ArrayList<String>()
            for(p in list) {
                out.add(gson.toJson(p))
            }
            return out
        }

        @JvmStatic
        fun serializeDNSInfoSet2StringList(list: Set<DNSInfo>): ArrayList<String> {
            var gson = Gson()
            var out = ArrayList<String>()
            for(p in list) {
                out.add(gson.toJson(p))
            }
            return out
        }

        @JvmStatic
        fun ping(address: InetAddress, port:Int): Int {
            val start = System.currentTimeMillis()
            val socket = Socket()
            try {
                socket.connect(InetSocketAddress(address, port), 5000)
                socket.close()
            } catch (e: Exception) {
                e.printStackTrace()
                print(address)
                return Int.MAX_VALUE
            }
            return (System.currentTimeMillis() - start).toInt()
        }

    }
}